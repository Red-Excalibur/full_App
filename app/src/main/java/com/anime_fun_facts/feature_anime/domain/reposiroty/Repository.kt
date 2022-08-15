package com.anime_fun_facts.feature_anime.domain.reposiroty

import com.anime_fun_facts.feature_anime.domain.model.anime_model.Anime
import com.anime_fun_facts.feature_anime.domain.model.anime_model.Anime_Data
import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes
import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes_Data
import retrofit2.Response

interface Repository {

    suspend fun getAnimes(): Response<Animes>

    suspend fun getAnime(anime_name:String): Response<Anime>
}