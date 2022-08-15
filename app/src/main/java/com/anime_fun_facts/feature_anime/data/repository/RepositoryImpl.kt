package com.anime_fun_facts.feature_anime.data.repository

import com.anime_fun_facts.feature_anime.data.data_source.remote.TheApi
import com.anime_fun_facts.feature_anime.domain.model.anime_model.Anime_Data
import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes
import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes_Data
import com.anime_fun_facts.feature_anime.domain.reposiroty.Repository
import retrofit2.Response
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val api : TheApi
) :Repository {
    override suspend fun getAnimes(): Response<Animes> {
        return  api.getAnimes()
    }

//    override suspend fun getAnime(): Response<List<Anime_Data>> {
//        return api.getAnime()
//    }
}