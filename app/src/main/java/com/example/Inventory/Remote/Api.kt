package com.example.Inventory.Remote

import com.example.Inventory.model.ItemModel
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Body

import retrofit2.http.POST
import retrofit2.http.Query

public interface Api {

    @GET("getInventory")
    fun getItemList(@Query("location") loc : String) : Call<List<ItemModel>>

    @POST("addInventory")
    fun addItem(@Body item:ItemModel): Call<ItemModel>

}