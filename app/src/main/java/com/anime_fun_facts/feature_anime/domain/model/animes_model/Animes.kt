package com.anime_fun_facts.feature_anime.domain.model.animes_model

data class Animes(
    val `data`: List<Animes_Data>,
    val success: Boolean
)