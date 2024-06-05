package com.example.catalist.details.api.model

import com.example.catalist.breeds.api.model.BreedApiModel
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class PhotoApiModel(
    val id: String,
    val url: String
//    val breeds: List<BreedApiModel>,
//    val width: Int,
//    val height: Int
)
