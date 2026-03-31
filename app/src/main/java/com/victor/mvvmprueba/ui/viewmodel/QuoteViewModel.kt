package com.victor.mvvmprueba.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victor.mvvmprueba.data.model.QuoteModel
import com.victor.mvvmprueba.data.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()


    fun randomQuote () {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}