package com.anime_fun_facts.di

import com.anime_fun_facts.feature_anime.data.data_source.remote.TheApi
import com.anime_fun_facts.feature_anime.data.repository.RepositoryImpl
import com.anime_fun_facts.feature_anime.domain.reposiroty.Repository
import com.anime_fun_facts.feature_anime.domain.use_cases.GetAnimesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    //db


    //api
    @Provides
    @Singleton
    fun providesApi():TheApi {
        return   Retrofit.Builder()
            .baseUrl("https://anime-facts-rest-api.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TheApi::class.java)
    }

    //Repository
    @Provides
    @Singleton
    fun providesRepository(api:TheApi):Repository{
        return RepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideGetAnimesUseCase (repository : Repository) :GetAnimesUseCase{
        return GetAnimesUseCase(repository)
    }
}