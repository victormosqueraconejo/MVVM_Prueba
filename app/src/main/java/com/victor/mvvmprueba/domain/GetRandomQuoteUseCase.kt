package com.victor.mvvmprueba.domain

import com.victor.mvvmprueba.data.QuoteRespository
import com.victor.mvvmprueba.data.model.QuoteModel
import com.victor.mvvmprueba.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    private val respository = QuoteRespository()

    operator fun invoke() : QuoteModel ? {
        val quotes = QuoteProvider.quotes

        if (!quotes.isNullOrEmpty()) {
            val randomValues = (0..quotes.size - 1).random()
            return quotes[randomValues]
        }

        return null
    }


}