package com.example.helloworld

import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityViewModel:ViewModel() {

    var number = 0
    fun addNumber(){
        number++
    }

    // Do things before the process is killed by the OS
    override fun onCleared() {
        super.onCleared()
    }

}