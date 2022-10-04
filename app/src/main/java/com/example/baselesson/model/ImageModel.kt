package com.example.baselesson.model

import java.io.Serializable

data class ImageModel(
    val image : String,
    var isSelected : Boolean
):Serializable
