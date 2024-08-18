package com.codewithroronoa.pokedex.utils


import android.graphics.drawable.Drawable
import androidx.compose.ui.graphics.Color
import com.codewithroronoa.pokedex.R
import com.codewithroronoa.pokedex.data.remote.responses.Type
import com.codewithroronoa.pokedex.data.remote.responses.Stat
import com.codewithroronoa.pokedex.ui.theme.*
import timber.log.Timber
import java.util.*

fun parseTypeToColor(type: Type): Color {
    return when(type.type.name.lowercase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when(stat.stat.name.lowercase(Locale.ROOT)) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    Timber.tag("val").e(stat.stat.name)
    return when(stat.stat.name.lowercase(Locale.ROOT)) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}

fun parseTypeToSVG(type: Type): Int {
    return when(type.type.name.lowercase(Locale.ROOT)) {
        "normal" -> R.drawable.normal
        "fire" -> R.drawable.fire
        "water" -> R.drawable.water
        "electric" -> R.drawable.electric
        "grass" -> R.drawable.grass
        "ice" -> R.drawable.ice
        "fighting" -> R.drawable.fighting
        "poison" -> R.drawable.poison
        "ground" -> R.drawable.ground
        "flying" -> R.drawable.flying
        "psychic" -> R.drawable.psychic
        "bug" -> R.drawable.bug
        "rock" -> R.drawable.rock
        "ghost" -> R.drawable.ghost
        "dragon" -> R.drawable.dragon
        "dark" -> R.drawable.dark
        "steel" -> R.drawable.steel
        "fairy" -> R.drawable.fairy
        else -> R.drawable.ic_international_pok_mon_logo
    }
}

fun eggToColor(egg : String):Color{
    return when (egg){
        "monster"-> Color(0xFFC19A6B)
        "water1" -> Color(0xff89cff0)
        "water2"-> Color(0xff7393b3)
        "water3" -> Color(0xff5f9ea0)
        "bug" -> TypeBug
        "flying" -> TypeFlying
        "ground" -> TypeGround
        "fairy" -> TypeFlying
        "plant" -> TypeGrass
        "humanshape" -> Color(0xff5F9EA0)
        "mineral" -> Color(0xff9a7b4f)
        "indeterminate" -> Color(0xff789578)
        "ditto" -> Color(0xff6495ED)
        "dragon" -> TypeDragon
        "no_eggs" -> Color.Yellow
        else -> {Color(0xFFFFFFFF)}
    }
}