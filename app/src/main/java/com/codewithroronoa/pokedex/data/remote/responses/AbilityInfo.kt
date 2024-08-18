package com.codewithroronoa.pokedex.data.remote.responses

data class AbilityInfo(
    val effect_changes: List<Any>,
    val effect_entries: List<EffectEntry>,
    val flavor_text_entries: List<FlavorTextEntryX>,
    val generation: GenerationX,
    val id: Int,
    val is_main_series: Boolean,
    val name: String,
    val names: List<NameX>,
    val pokemon: List<PokemonXX>
)