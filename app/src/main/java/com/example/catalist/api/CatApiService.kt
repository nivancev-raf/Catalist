package com.example.catalist.api

import com.example.catalist.model.Breed
import retrofit2.http.GET
import retrofit2.http.Path

// Retrofit interfejs za API pozive

interface CatApiService {
    @GET("breeds")
    suspend fun listBreeds(): List<Breed>

    @GET("breeds/{breed_id}")
    suspend fun getBreedDetails(@Path("breed_id") breedId: String): Breed

    // Dodajte ostale API metode po potrebi
}
