package com.codewithroronoa.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.codewithroronoa.pokedex.pokemonDetail.PokemonDetailScreen
import com.codewithroronoa.pokedex.pokemonlist.PokemonListScreen
import com.codewithroronoa.pokedex.ui.theme.PokedexTheme
import dagger.hilt.android.AndroidEntryPoint
import java.util.Locale


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokedexTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "pokemon_list_screen") {
                    composable("pokemon_list_screen"){
                        PokemonListScreen(navController = navController)
                    }
                    composable("pokemon_detail_screen/{dColor}/{name}/{number}",
                        arguments = listOf(
                            navArgument("dColor"){
                                type = NavType.IntType
                            },
                            navArgument("name"){
                                type = NavType.StringType
                            },
                            navArgument("number"){
                                type = NavType.IntType
                            }
                        )
                    ){
                        val dColor = remember {
                            val color = it.arguments?.getInt("dColor")
                            color?.let { Color(it) }?: Color.White

                        }
                        val pName = remember {
                            it.arguments?.getString("name")
                        }
                        val number = remember {
                            it.arguments?.getInt("number")
                        }
                        if (number != null) {
                            PokemonDetailScreen(
                                dominantColor = dColor,
                                pokemonName = pName?.lowercase(Locale.getDefault()) ?:"",
                                navController = navController,
                                pokemonNumber = number
                            )
                        }
                    }
                }
            }
        }
    }
}
