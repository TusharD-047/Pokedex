package com.codewithroronoa.pokedex.data.remote.responses

data class typeXX(
    val damage_relations: DamageRelations,
    val game_indices: List<GameIndiceX>,
    val generation: GenerationXXX,
    val id: Int,
    val move_damage_class: MoveDamageClass,
    val moves: List<MoveXX>,
    val name: String,
    val names: List<NameXX>,
    val past_damage_relations: List<Any>,
    val pokemon: List<PokemonXXXX>,
    val sprites: SpritesX
)