package com.hcerqueira.minhadespensa.data

import androidx.room.*
import com.hcerqueira.minhadespensa.model.Product
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDao {
    @Query("SELECT * FROM products ORDER BY name ASC")
    fun getAllProducts(): Flow<List<Product>>
    @Query("SELECT * FROM products WHERE id = :productId")
    suspend fun getProductById(productId: Int): Product?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(product: Product)
    @Update
    suspend fun updateProduct(product: Product)
    @Delete
    suspend fun deleteProduct(product: Product)
}