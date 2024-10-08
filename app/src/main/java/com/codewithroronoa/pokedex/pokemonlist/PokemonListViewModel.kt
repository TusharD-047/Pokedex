package com.codewithroronoa.pokedex.pokemonlist

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.capitalize
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.palette.graphics.Palette
import com.codewithroronoa.pokedex.Repository.PokemonRepository
import com.codewithroronoa.pokedex.data.models.PokeDexListEntry
import com.codewithroronoa.pokedex.utils.Constants.PAGE_SIZE
import com.codewithroronoa.pokedex.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber
import java.util.Locale
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    private var currPage =0;

    var pokemonList = mutableStateOf<List<PokeDexListEntry>>(listOf())
    var loadError = mutableStateOf("")
    var isLoading = mutableStateOf(false)
    var endReached = mutableStateOf(false)

    private var cachedPokemonList = listOf<PokeDexListEntry>()
    private var isSearchStarting =true;
    var isSearching = mutableStateOf(false)


    init {
        loadPokemonPaginated()
    }

    fun searchPokemonList( query : String){
        val listToSearch = if(isSearchStarting){
            pokemonList.value
        } else {
            cachedPokemonList
        }
        viewModelScope.launch (Dispatchers.Default){
            if(query.isEmpty()){
                pokemonList.value = cachedPokemonList
                isSearching.value = false
                isSearchStarting = true
            }
            val result = listToSearch.filter {
                it.pokemonName.contains(query.trim(), ignoreCase = true) ||
                        it.number.toString() == query.trim()
            }
            if(isSearchStarting){
                cachedPokemonList = pokemonList.value
                isSearchStarting = false
            }
            pokemonList.value = result
            isSearching.value = true
        }

    }

    fun loadPokemonPaginated(){
        viewModelScope.launch {
            isLoading.value = true
            val result = repository.getPokemonList(PAGE_SIZE,currPage* PAGE_SIZE)
            when(result){
                is Resource.Success->{
                    endReached.value = currPage * PAGE_SIZE >=result.data!!.count
                    val pokeDexEntries = result.data.results.mapIndexed { index, entry ->
                        val number = if(entry.url.endsWith("/")){
                            entry.url.dropLast(1).takeLastWhile { it.isDigit() }
                        }else{
                            entry.url.takeLastWhile { it.isDigit() }
                        }
                        val url = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/${number}.png"
                        PokeDexListEntry(entry.name.capitalize(Locale.ROOT),url,number.toInt())
                    }
                    currPage++
                    loadError.value = ""
                    isLoading.value = false
                    pokemonList.value += pokeDexEntries
                }
                is Resource.Error -> {
                    loadError.value = result.message!!
                    isLoading.value = false
                }

                is Resource.Loading -> TODO()
            }
        }
    }

    fun calcDominantColor(drawable: Drawable, onFinish : (Color) -> Unit) {
        val bitmap =  (drawable as BitmapDrawable).bitmap.copy(Bitmap.Config.ARGB_8888,true)

        Palette.from(bitmap).generate{ palette ->
            palette?.dominantSwatch?.rgb?.let { colorValue ->
                onFinish(Color(colorValue))
            }
        }
    }
}