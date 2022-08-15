package com.anime_fun_facts.feature_anime.domain.model.anime_model

data class Anime(
    val `data`: List<Anime_Data>,
    val img: String,
    val success: Boolean,
    val total_facts: Int
)