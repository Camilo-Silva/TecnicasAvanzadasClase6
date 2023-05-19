package com.example.ejercicio6recyclerviewv2

data class Pokemon(
    val id: Int,
    val name: String,
    val vida: String,
    val fuerza: String,
    val defensa: String,
    val tipo: TipoPokemon,
    val url: String
)

enum class TipoPokemon {
    PLANTA, AGUA, FUEGO, LUCHA, ELECTRICO
}
