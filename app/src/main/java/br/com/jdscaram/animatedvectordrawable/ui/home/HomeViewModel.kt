package br.com.jdscaram.animatedvectordrawable.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Home sweet home"
    }
    val text: LiveData<String> = _text
}