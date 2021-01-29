package com.example.helloworld.views

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class FragmentTwoViewModel:ViewModel() {

    private val _number: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>().apply {
            value = 0
        }
    }

    fun getNumber(): LiveData<Int>{
        return _number
    }

    fun addNumber(){
        _number.value = _number.value?.plus(1)
    }

    // Do things before the process is killed by the OS
    override fun onCleared() {
        super.onCleared()
    }

}