package com.example.ejercicio6recyclerviewv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PokemonAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = PokemonAdapter(applicationContext)
        recyclerView.adapter =adapter

        adapter.submitList(getListadoPokemon())
        adapter.onItemClickListener = {pokemon ->
//            Toast.makeText(this, pokemon.name, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", pokemon.name)
            intent.putExtra("url", pokemon.url)
            startActivity(intent)
        }

    }

    private fun getListadoPokemon(): MutableList<Pokemon>? {
        return  mutableListOf(
            Pokemon(1, "Bulbasaur", "45", "56", "53", TipoPokemon.PLANTA,"https://static.wikia.nocookie.net/espokemon/images/4/43/Bulbasaur.png/revision/latest/scale-to-width-down/1000?cb=20170120032346"),
            Pokemon(2, "Charmaleon", "46", "46", "83", TipoPokemon.FUEGO, "https://static.wikia.nocookie.net/espokemon/images/f/fb/Charmeleon.png/revision/latest?cb=20140207202536"),
            Pokemon(3, "Pikachu", "35", "36", "73", TipoPokemon.ELECTRICO, "https://static.wikia.nocookie.net/espokemon/images/7/77/Pikachu.png/revision/latest?cb=20150621181250"),
            Pokemon(4, "Charmaleon", "46", "46", "83", TipoPokemon.FUEGO, "https://static.wikia.nocookie.net/espokemon/images/f/fb/Charmeleon.png/revision/latest?cb=20140207202536"),
            Pokemon(5,"Bulbasaur", "45", "56", "53", TipoPokemon.AGUA, "https://static.wikia.nocookie.net/espokemon/images/4/43/Bulbasaur.png/revision/latest/scale-to-width-down/1000?cb=20170120032346"),
            Pokemon(6, "Charmaleon", "46", "46", "83", TipoPokemon.LUCHA, "https://static.wikia.nocookie.net/espokemon/images/f/fb/Charmeleon.png/revision/latest?cb=20140207202536"),
            Pokemon(7,"Bulbasaur", "45", "56", "53", TipoPokemon.PLANTA, "https://static.wikia.nocookie.net/espokemon/images/4/43/Bulbasaur.png/revision/latest/scale-to-width-down/1000?cb=20170120032346"),
            Pokemon(8, "Charmaleon", "46", "46", "83", TipoPokemon.FUEGO, "https://static.wikia.nocookie.net/espokemon/images/f/fb/Charmeleon.png/revision/latest?cb=20140207202536"),
            Pokemon(9,"Bulbasaur", "45", "56", "53", TipoPokemon.PLANTA, "https://static.wikia.nocookie.net/espokemon/images/4/43/Bulbasaur.png/revision/latest/scale-to-width-down/1000?cb=20170120032346"),
            Pokemon(10, "Charmaleon", "46", "46", "83", TipoPokemon.FUEGO, "https://static.wikia.nocookie.net/espokemon/images/f/fb/Charmeleon.png/revision/latest?cb=20140207202536"),
            Pokemon(11,"Bulbasaur", "45", "56", "53", TipoPokemon.AGUA, "https://static.wikia.nocookie.net/espokemon/images/4/43/Bulbasaur.png/revision/latest/scale-to-width-down/1000?cb=20170120032346"),
            Pokemon(12, "Charmaleon", "46", "46", "83", TipoPokemon.FUEGO, "https://static.wikia.nocookie.net/espokemon/images/f/fb/Charmeleon.png/revision/latest?cb=20140207202536"),
            Pokemon(13, "Pikachu", "35", "36", "73", TipoPokemon.ELECTRICO, "https://static.wikia.nocookie.net/espokemon/images/7/77/Pikachu.png/revision/latest?cb=20150621181250")
        )
    }
}