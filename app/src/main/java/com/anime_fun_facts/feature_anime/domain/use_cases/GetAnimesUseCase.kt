package com.anime_fun_facts.feature_anime.domain.use_cases

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LifecycleCoroutineScope
import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes
import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes_Data
import com.anime_fun_facts.feature_anime.domain.reposiroty.Repository
import com.anime_fun_facts.feature_anime.domain.utils.MyCompanion
import kotlinx.coroutines.*
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject

class GetAnimesUseCase @Inject constructor (
    private val repository :Repository,

        ) {

    operator fun invoke ( ){
         var response :Response<Animes> ?=null

        val job = GlobalScope.launch {
              response = try {
                repository.getAnimes()
            } catch (e: IOException){
//               Toast.makeText(contextt , "Network Problem ",Toast.LENGTH_LONG).show()
                return@launch
            }catch (e: HttpException){
//                  Toast.makeText(contextt , "Network Problem ",Toast.LENGTH_LONG).show()
//                log.d()
                return@launch
            }

            //here means we got a response



        }
        //it blocks the thread until it finishes
        //that how i used it to set the state in the viewModel
        runBlocking {
            job.join()
            if(response?.isSuccessful ?:return@runBlocking  &&(response?.body() != null)){
                Log.d("alo :","Successful response from the use case")
                MyCompanion.myListAnimes = response?.body()?.data!!
                Log.d("alo :","the list is set to the companion successfully in the Usecase")

            }
        }





    }



}