package com.victor.mvvmprueba.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victor.mvvmprueba.model.QuoteModel
import com.victor.mvvmprueba.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()


    fun randomQuote () {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}