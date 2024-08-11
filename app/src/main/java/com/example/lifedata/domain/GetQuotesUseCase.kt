package com.example.lifedata.domain

import com.example.lifedata.data.QuoteRepository

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke() = repository.getAllQuotes()

}