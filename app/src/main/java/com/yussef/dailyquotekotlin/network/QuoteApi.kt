package com.yussef.dailyquotekotlin.network

import com.yussef.dailyquotekotlin.network.responses.Quote
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET
import retrofit2.http.Url

val BASE_URL = "http://api.forismatic.com/api/1.0/"

interface QuoteApi {
    @GET
    fun getRandomQuote(@Url url: String) : Flowable<Quote>
}