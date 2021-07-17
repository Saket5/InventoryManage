package com.example.Inventory.model

import java.io.Serializable

data class ItemModel(
    var itemId:String,
    var location : String,
    var item :String,
    var quantity : Int
):Serializable
