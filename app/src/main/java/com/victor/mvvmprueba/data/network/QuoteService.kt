package com.victor.mvvmprueba.data.network

import com.victor.mvvmprueba.core.RetrofitHelper
import com.victor.mvvmprueba.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class QuoteService {

    private val retrofit = RetrofitHelper.getRetroFit()


    suspend fun getQuotes () : List<QuoteModel> {

        return withContext(Dispatchers.IO) {
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()

            response.body() ?: emptyList()
        }
    }
}