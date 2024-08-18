package com.codewithroronoa.pokedex.data.remote.responses

data class Pokemon(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)