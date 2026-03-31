package com.victor.mvvmprueba.data.network

import com.victor.mvvmprueba.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {

    @GET(".json")
    suspend fun getAllQuotes () : Response<List<QuoteModel>>



}