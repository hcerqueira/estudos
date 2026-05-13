package com.hcerqueira.minhadespensa.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hcerqueira.minhadespensa.data.AppDatabase
import com.hcerqueira.minhadespensa.model.Product
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class ProductViewModel(database: AppDatabase) : ViewModel() {
    private val productDao = database.productDao()

    // Lista completa de produtos
    private val allProducts = productDao.getAllProducts()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000L),
            initialValue = emptyList()
        )

    // Produtos filtrados por busca
    val products = allProducts

    // Estatísticas - VERSÃO SIMPLIFICADA E CORRIGIDA
    val statistics = allProducts.map { products ->
        val totalProducts = products.size
        val totalQuantity = products.sumOf { it.quantity }

        // Cria um mapa manualmente para evitar problemas de tipo
        val categoriesMap = mutableMapOf<String, Int>()
        products.forEach { product ->
            val category = product.category ?: "Sem Categoria"
            categoriesMap[category] = categoriesMap.getOrDefault(category, 0) + 1
        }

        Statistics(
            totalProducts = totalProducts,
            totalQuantity = totalQuantity,
            categories = categoriesMap
        )
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000L),
        initialValue = Statistics()
    )

    // Buscar produtos - CORRIGIDO
    fun searchProducts(query: String) = allProducts.map { products ->
        if (query.isBlank()) {
            products
        } else {
            products.filter { product ->
                product.name.contains(query, ignoreCase = true) ||
                        (product.category?.contains(query, ignoreCase = true) == true) // ← CORREÇÃO AQUI
            }
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000L),
        initialValue = emptyList()
    )

    fun addProduct(name: String, quantity: Int, category: String = "Geral") {
        viewModelScope.launch {
            productDao.insertProduct(
                Product(
                    name = name,
                    quantity = quantity,
                    category = category
                )
            )
        }
    }

    fun updateProduct(product: Product) {
        viewModelScope.launch {
            productDao.updateProduct(product)
        }
    }

    fun deleteProduct(product: Product) {
        viewModelScope.launch {
            productDao.deleteProduct(product)
        }
    }
}

// Data class para estatísticas
data class Statistics(
    val totalProducts: Int = 0,
    val totalQuantity: Int = 0,
    val categories: Map<String, Int> = emptyMap()
)