package com.anime_fun_facts.feature_anime.data.data_source.remote

import com.anime_fun_facts.feature_anime.domain.model.anime_model.Anime
import com.anime_fun_facts.feature_anime.domain.model.anime_model.Anime_Data
import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes
import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes_Data
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface TheApi {

    @GET("api/v1")
    suspend fun getAnimes():Response<Animes>

    @GET("api/v1/{anime_name}")
    suspend fun getAnime(@Path("anime_name") anime_name :String):Response<Anime>
}