package com.codewithroronoa.pokedex.data.remote

import com.codewithroronoa.pokedex.data.remote.responses.AbilityInfo
import com.codewithroronoa.pokedex.data.remote.responses.Pokemon
import com.codewithroronoa.pokedex.data.remote.responses.PokemonData
import com.codewithroronoa.pokedex.data.remote.responses.PokemonSpecies
import com.codewithroronoa.pokedex.data.remote.responses.typeXX
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit : Int,
        @Query("offset") offset : Int
    ) : Pokemon

    @GET("pokemon/{name}")
    suspend fun getPokemonData(
        @Path("name") name : String
    ) : PokemonData

    @GET("pokemon-species/{id}")
    suspend fun getPokemonSpecies(
        @Path("id") id : String
    ) : PokemonSpecies
    @GET("ability/{id}")
    suspend fun getAbilityStats(
        @Path("id") id : String
    ) : AbilityInfo
    @GET("type/{id}")
    suspend fun getDamageStats(
        @Path("id") id : String
    ) : typeXX

}