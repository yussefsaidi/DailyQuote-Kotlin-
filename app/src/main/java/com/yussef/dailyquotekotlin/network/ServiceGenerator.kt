package com.yussef.dailyquotekotlin.network

import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceGenerator {

    private val retrofitBuilder : Retrofit.Builder =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())

    private val retrofit : Retrofit = retrofitBuilder.build()

    private val quoteApi : QuoteApi = retrofit.create(QuoteApi::class.java)

     fun getQuoteApi() : QuoteApi {
        return quoteApi
    }
}