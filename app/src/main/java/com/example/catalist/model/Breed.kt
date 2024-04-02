package com.example.catalist.model
// Data klasa za rase mačaka

data class Breed(
    val id: String,
    val name: String,
    val description: String,
    val temperament: String,
    val life_span: String, // zivotni vek
    // Dodajte ostale polja po potrebi
)