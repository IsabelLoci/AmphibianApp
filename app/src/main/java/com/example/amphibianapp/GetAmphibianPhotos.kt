package com.example.amphibianapp

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class GetAmphibianPhotos : ViewModel() {

    private val _amphibians = MutableStateFlow<List<Amphibian>>(emptyList())
    val amphibians: StateFlow<List<Amphibian>> = _amphibians

    init {
        getAmphibianPhotos()
    }

    private fun getAmphibianPhotos() {
        viewModelScope.launch {
            try {
                _amphibians.value = amphibianApiService.getAmphibians()
            } catch (e: Exception) {
                 Log.e("AmphibianViewModel", "API call failed", e)
            }
        }
    }
}
