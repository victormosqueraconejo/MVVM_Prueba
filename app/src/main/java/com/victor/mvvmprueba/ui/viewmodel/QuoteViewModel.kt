package com.victor.mvvmprueba.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.victor.mvvmprueba.data.model.QuoteModel
import com.victor.mvvmprueba.data.model.QuoteProvider
import com.victor.mvvmprueba.domain.GetQuotesUseCase
import com.victor.mvvmprueba.domain.GetRandomQuoteUseCase
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    val isLoading = MutableLiveData<Boolean>()

    val getRandomQuoteUseCase = GetRandomQuoteUseCase()

    var getQuotesUseCase = GetQuotesUseCase()
    fun onCreate () {

        viewModelScope.launch {

            isLoading.postValue(true)

            var result = getQuotesUseCase()

            if (!result.isNullOrEmpty()) {
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }

    }


    fun randomQuote () {
        isLoading.postValue(true)

        val quote = getRandomQuoteUseCase()
        if (quote != null ){
            quoteModel.postValue(quote)
        }

        isLoading.postValue(false)


    }



}