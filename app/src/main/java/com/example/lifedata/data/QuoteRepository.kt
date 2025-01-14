package com.example.lifedata.data

import com.example.lifedata.data.model.QuoteModel
import com.example.lifedata.data.model.QuoteProvider
import com.example.lifedata.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}