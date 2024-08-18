package com.codewithroronoa.pokedex.Repository

import com.codewithroronoa.pokedex.data.remote.PokeApi
import com.codewithroronoa.pokedex.data.remote.responses.AbilityInfo
import com.codewithroronoa.pokedex.data.remote.responses.Pokemon
import com.codewithroronoa.pokedex.data.remote.responses.PokemonData
import com.codewithroronoa.pokedex.data.remote.responses.PokemonSpecies
import com.codewithroronoa.pokedex.data.remote.responses.typeXX
import com.codewithroronoa.pokedex.utils.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api : PokeApi
) {
    suspend fun getPokemonList(limit : Int,offset:Int) : Resource<Pokemon> {
        val response = try {
            api.getPokemonList(limit,offset)
        }catch (_: Exception){
            return Resource.Error("An error has occurred")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonData(pokemonName : String) : Resource<PokemonData> {
        val response = try {
            api.getPokemonData(pokemonName)
        }catch (_: Exception){
            return Resource.Error("An error has occurred")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonSpecies(id : String) : Resource<PokemonSpecies>{
        val response = try {
            api.getPokemonSpecies(id)
        }catch (_: Exception){
            return Resource.Error("An error has occured")
        }
        return Resource.Success(response)
    }

    suspend fun getAbilityInfo(id : String) : Resource<AbilityInfo>{
        val response = try {
            api.getAbilityStats(id)
        }catch (_: Exception){
            return Resource.Error("An error has occured")
        }
        return Resource.Success(response)
    }

    suspend fun getDamageInfo(damage : String) : Resource<typeXX>{
        val response = try {
            api.getDamageStats(damage)
        }catch (_: Exception){
            return Resource.Error("An error has occured")
        }
        return Resource.Success(response)
    }
}