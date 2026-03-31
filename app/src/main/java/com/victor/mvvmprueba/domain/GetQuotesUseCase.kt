package com.victor.mvvmprueba.domain

import com.victor.mvvmprueba.data.QuoteRespository
import com.victor.mvvmprueba.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRespository()


    suspend operator fun invoke() : List<QuoteModel> ? {
        return repository.getAllQuotes()
    }

}