package com.hcerqueira.minhadespensa.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hcerqueira.minhadespensa.model.Product
import com.hcerqueira.minhadespensa.viewmodel.ProductViewModel
import com.hcerqueira.minhadespensa.viewmodel.Statistics

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductListScreen(
    viewModel: ProductViewModel = viewModel()
) {
    var productName by remember { mutableStateOf("") }
    var productQuantity by remember { mutableStateOf("1") }
    var productCategory by remember { mutableStateOf("Geral") }
    var searchQuery by remember { mutableStateOf("") }
    var editingProduct by remember { mutableStateOf<Product?>(null) }
    var showStatistics by remember { mutableStateOf(false) }

    val products by viewModel.products.collectAsState()
    val searchResults by viewModel.searchProducts(searchQuery).collectAsState()
    val statistics by viewModel.statistics.collectAsState()

    val categories = listOf("Geral", "Bebidas", "Limpeza", "Higiene", "Alimentos", "Frios", "Padaria")

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Minha Despensa") },
                actions = {
                    IconButton(onClick = { showStatistics = true }) {
                        Icon(Icons.Default.Info, contentDescription = "Estatísticas")
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    if (productName.isNotBlank()) {
                        viewModel.addProduct(
                            productName,
                            productQuantity.toIntOrNull() ?: 1,
                            productCategory
                        )
                        productName = ""
                        productQuantity = "1"
                        productCategory = "Geral"
                    }
                }
            ) {
                Icon(Icons.Default.Add, contentDescription = "Adicionar Produto")
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // Barra de busca
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Default.Search,
                        contentDescription = "Buscar",
                        modifier = Modifier.padding(end = 8.dp)
                    )
                    OutlinedTextField(
                        value = searchQuery,
                        onValueChange = { searchQuery = it },
                        label = { Text("Buscar produtos...") },
                        modifier = Modifier.weight(1f),
                        singleLine = true
                    )
                }
            }

            // Formulário para adicionar produto
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Adicionar Produto", style = MaterialTheme.typography.titleMedium)
                    Spacer(modifier = Modifier.height(8.dp))

                    OutlinedTextField(
                        value = productName,
                        onValueChange = { productName = it },
                        label = { Text("Nome do produto") },
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        OutlinedTextField(
                            value = productQuantity,
                            onValueChange = { productQuantity = it },
                            label = { Text("Quantidade") },
                            modifier = Modifier.weight(1f)
                        )

                        // Seletor de categoria
                        var expanded by remember { mutableStateOf(false) }
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .wrapContentHeight()
                        ) {
                            OutlinedTextField(
                                value = productCategory,
                                onValueChange = { },
                                label = { Text("Categoria") },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable { expanded = true },
                                readOnly = true,
                                trailingIcon = {
                                    DropdownMenu(
                                        expanded = expanded,
                                        onDismissRequest = { expanded = false }
                                    ) {
                                        categories.forEach { category ->
                                            DropdownMenuItem(
                                                text = { Text(category) },
                                                onClick = {
                                                    productCategory = category
                                                    expanded = false
                                                }
                                            )
                                        }
                                    }
                                }
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Lista de produtos (usa resultados da busca ou lista completa)
            val displayProducts = if (searchQuery.isNotBlank()) searchResults else products

            if (displayProducts.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        if (searchQuery.isNotBlank()) "Nenhum produto encontrado"
                        else "Nenhum produto na despensa"
                    )
                }
            } else {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    items(displayProducts) { product ->
                        ProductItem(
                            product = product,
                            onDelete = { viewModel.deleteProduct(it) },
                            onEdit = { editingProduct = it }
                        )
                    }
                }
            }
        }
    }

    // Dialog de edição (atualizado com categoria)
    EditProductDialog(
        product = editingProduct,
        categories = categories,
        onDismiss = { editingProduct = null },
        onConfirm = { name, quantity, expiryDate, category ->
            editingProduct?.let { product ->
                viewModel.updateProduct(
                    product.copy(
                        name = name,
                        quantity = quantity,
                        expiryDate = if (expiryDate.isBlank()) null else expiryDate,
                        category = category
                    )
                )
            }
            editingProduct = null
        }
    )

    // Dialog de estatísticas
    if (showStatistics) {
        StatisticsDialog(
            statistics = statistics,
            onDismiss = { showStatistics = false }
        )
    }
}

@Composable
fun ProductItem(
    product: Product,
    onDelete: (Product) -> Unit,
    onEdit: (Product) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onEdit(product) },
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = product.name,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "Quantidade: ${product.quantity} • ${product.category}",
                    style = MaterialTheme.typography.bodyMedium
                )
                product.expiryDate?.let { expiry ->
                    Text(
                        text = "Validade: $expiry",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
            IconButton(onClick = { onDelete(product) }) {
                Icon(Icons.Default.Delete, contentDescription = "Deletar")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditProductDialog(
    product: Product?,
    categories: List<String>,
    onDismiss: () -> Unit,
    onConfirm: (String, Int, String, String) -> Unit
) {
    var productName by remember { mutableStateOf(product?.name ?: "") }
    var productQuantity by remember { mutableStateOf(product?.quantity?.toString() ?: "1") }
    var expiryDate by remember { mutableStateOf(product?.expiryDate ?: "") }
    var selectedCategory by remember { mutableStateOf(product?.category ?: "Geral") }

    if (product != null) {
        AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text("Editar Produto") },
            text = {
                Column {
                    OutlinedTextField(
                        value = productName,
                        onValueChange = { productName = it },
                        label = { Text("Nome do produto") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        OutlinedTextField(
                            value = productQuantity,
                            onValueChange = { productQuantity = it },
                            label = { Text("Quantidade") },
                            modifier = Modifier.weight(1f)
                        )

                        var expanded by remember { mutableStateOf(false) }
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .wrapContentHeight()
                        ) {
                            OutlinedTextField(
                                value = selectedCategory,
                                onValueChange = { },
                                label = { Text("Categoria") },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable { expanded = true },
                                readOnly = true
                            )
                            DropdownMenu(
                                expanded = expanded,
                                onDismissRequest = { expanded = false }
                            ) {
                                categories.forEach { category ->
                                    DropdownMenuItem(
                                        text = { Text(category) },
                                        onClick = {
                                            selectedCategory = category
                                            expanded = false
                                        }
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    OutlinedTextField(
                        value = expiryDate,
                        onValueChange = { expiryDate = it },
                        label = { Text("Data de validade (opcional)") },
                        placeholder = { Text("DD/MM/AAAA") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        onConfirm(
                            productName,
                            productQuantity.toIntOrNull() ?: 1,
                            expiryDate,
                            selectedCategory
                        )
                    }
                ) {
                    Text("Salvar")
                }
            },
            dismissButton = {
                Button(onClick = onDismiss) {
                    Text("Cancelar")
                }
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StatisticsDialog(
    statistics: Statistics,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Estatísticas da Despensa") },
        text = {
            Column {
                Text("📊 Resumo Geral", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp))

                Text("• Total de produtos: ${statistics.totalProducts}")
                Text("• Quantidade total: ${statistics.totalQuantity} itens")

                Spacer(modifier = Modifier.height(16.dp))

                Text("🗂️ Produtos por Categoria", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp))

                if (statistics.categories.isEmpty()) {
                    Text("Nenhuma categoria com produtos")
                } else {
                    statistics.categories.forEach { (category, count) ->
                        Text("• $category: $count produtos")
                    }
                }
            }
        },
        confirmButton = {
            Button(onClick = onDismiss) {
                Text("Fechar")
            }
        }
    )
}

@Preview
@Composable
fun PreviewProductListScreen() {
    ProductListScreen()
}