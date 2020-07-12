package br.com.jdscaram.animatedvectordrawable.ui.parties

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PartiesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Cheer up the party has started"
    }
    val text: LiveData<String> = _text
}