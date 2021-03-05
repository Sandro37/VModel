package com.example.vmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel()
{
    var nContador =  MutableLiveData<String>().apply { value = contador.toString() }
    private var contador: Int = 0

    private fun setEmContador(){
        nContador.value = contador.toString()
    }

    private fun validarContador() {
        contador++
        if(contador > 5){
            contador = 0
        }
        setEmContador()
    }

    fun contador(){
        validarContador()
    }
}