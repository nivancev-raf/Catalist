package com.example.catalist.repository

import com.example.catalist.model.Breed

// Komunicira sa API-jem i upravlja podacima

object CatRepository {
    private var mutableCatList = SampleBreeds.toMutableList()
    fun allCats() : List<Breed> = mutableCatList

    fun getById(id: String) : Breed? {
        return mutableCatList.find { it.id == id }
    }
}