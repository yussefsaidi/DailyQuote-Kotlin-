package com.yussef.dailyquotekotlin.ui

import androidx.lifecycle.ViewModel
import com.yussef.dailyquotekotlin.network.ServiceGenerator
import com.yussef.dailyquotekotlin.network.responses.Quote
import io.reactivex.rxjava3.schedulers.Schedulers

class QuoteViewModel: ViewModel() {

    fun getQuote() : Quote {
        return ServiceGenerator.getQuoteApi().getRandomQuote("https://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en")
            .subscribeOn(Schedulers.io())
            .blockingLast()
    }


}