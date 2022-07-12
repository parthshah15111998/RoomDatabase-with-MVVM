package com.example.mvvmdemo

import androidx.lifecycle.LiveData

class QuoteRepository(private val quoteDao: QuoteDao) {

    fun getQuotes():LiveData<List<Quote>>{
        return quoteDao.getQuotes()
    }

     fun insertQuotes(quote: Quote){
        quoteDao.insertQuotes(quote)
    }
}