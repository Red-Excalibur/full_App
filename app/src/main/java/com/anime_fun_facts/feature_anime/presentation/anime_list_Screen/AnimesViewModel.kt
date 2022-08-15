package com.anime_fun_facts.feature_anime.presentation.anime_list_Screen

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes_Data
import com.anime_fun_facts.feature_anime.domain.use_cases.GetAnimesUseCase
import com.anime_fun_facts.feature_anime.domain.utils.MyCompanion
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class AnimesViewModel @Inject constructor  (
    private val getAnimesUseCase: GetAnimesUseCase
        ):ViewModel() {

    private val _state = MutableStateFlow<List<Animes_Data>>(emptyList())
    val state : StateFlow<List<Animes_Data>> =_state
init {
   viewModelScope.launch {
         getAnimes()


   }
}

private fun getAnimes() {

    getAnimesUseCase()      //now its note a coroutine it will finishes first then we pass below

    //because we used the runBlocking we waited the first coroutine to end and the second too by blocking this
    //thread until we make sure we got the data before setting it below to the state
    _state.value=MyCompanion.myListAnimes
    Log.d("alo :","the list is set to the companion successfully in the ViewModel")


}
}
