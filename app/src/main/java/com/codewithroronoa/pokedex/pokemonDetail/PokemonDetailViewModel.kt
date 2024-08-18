package com.codewithroronoa.pokedex.pokemonDetail

import androidx.compose.runtime.saveable.rememberSaveable
import androidx.lifecycle.ViewModel
import com.codewithroronoa.pokedex.Repository.PokemonRepository
import com.codewithroronoa.pokedex.data.remote.responses.AbilityInfo
import com.codewithroronoa.pokedex.data.remote.responses.PokemonData
import com.codewithroronoa.pokedex.data.remote.responses.PokemonSpecies
import com.codewithroronoa.pokedex.data.remote.responses.typeXX
import com.codewithroronoa.pokedex.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel(){

    suspend fun getPokemonInfo(pokemonName : String) : Resource<PokemonData>{
        return repository.getPokemonData(pokemonName)
    }
    suspend fun getPokemonSpecies(id : String) : Resource<PokemonSpecies>{
        return repository.getPokemonSpecies(id)
    }
    suspend fun getPokemonAbilities(id : String) : Resource<AbilityInfo>{
        return repository.getAbilityInfo(id)
    }
    suspend fun getDamage(damage : String) : Resource<typeXX>{
        return repository.getDamageInfo(damage)
    }
}