package com.example.shoppinglist.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.androidcourse.shoppinglistkotlin.model.Product

@Dao
interface ProductDAO {
    @Query("SELECT * FROM product_table")
    suspend fun getAllProducts(): List <Product>

    @Insert
    suspend fun insertProduct(product:Product)

    @Delete
    suspend fun deleteProduct(product: Product)

    @Query("DELETE FROM product_table")
    suspend fun deleteAllProducts()
}