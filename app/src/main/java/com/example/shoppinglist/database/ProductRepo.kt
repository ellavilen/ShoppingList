package com.example.shoppinglist.database

import android.content.Context
import com.androidcourse.shoppinglistkotlin.model.Product

class ProductRepo(context: Context) {

    private val productDao : ProductDAO

    init {
        val database =
            ShoppingListRoomDatabase.getDatabase(
                context
            )
        productDao = database!!.productDao()
    }

    suspend fun getAllProducts():List<Product>{
        return productDao.getAllProducts()
    }

    suspend fun insertProduct(product: Product){
        productDao.insertProduct(product)
    }

    suspend fun deleteProduct(product: Product){
        productDao.deleteProduct(product)
    }

    suspend fun deleteAllProducts(){
        productDao.deleteAllProducts()
    }
}