package com.example.catalist.api
// Singleton objekat za instanciranje Retrofit-a


import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private const val BASE_URL = "https://api.thecatapi.com/v1/"

    val retrofit: Retrofit by lazy { // lazy osigurava da se instanca kreira samo jednom
        Retrofit.Builder()
            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: CatApiService by lazy {
        retrofit.create(CatApiService::class.java)
    }
}
