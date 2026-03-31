package com.victor.mvvmprueba.data

import com.victor.mvvmprueba.data.model.QuoteModel
import com.victor.mvvmprueba.data.model.QuoteProvider
import com.victor.mvvmprueba.data.network.QuoteApiClient
import com.victor.mvvmprueba.data.network.QuoteService

class QuoteRespository {

    private val api = QuoteService()

    suspend fun getAllQuotes () : List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }

}