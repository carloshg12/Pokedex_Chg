package com.example.pokedex_chg.data.sources.local

import com.example.pokedex_chg.domains.models.Pokemon
import com.example.pokedex_chg.domains.models.ReducedPokemonData
import com.example.pokedex_chg.domains.repositories.PokemonRepository
import com.example.pokedex_chg.mappers.PokemonJsonMapper
import org.json.simple.JSONObject

class PokemonJson(private val mapper: PokemonJsonMapper) : PokemonRepository {

    override fun getPokemonByArchive(jsonObject: JSONObject): Pokemon {
        return mapper.mapToPokemon(jsonObject)
    }

    override suspend fun getPokemonByName(name: String): Pokemon {
        TODO("Not yet implemented")
    }

    override suspend fun getPokemonById(id: Int): Pokemon {
        TODO("Not yet implemented")
    }

    override suspend fun getAllPokemons(): List<ReducedPokemonData> {
        TODO("Not yet implemented")
    }
}
