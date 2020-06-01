package com.yussef.dailyquotekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.yussef.dailyquotekotlin.network.responses.Quote
import com.yussef.dailyquotekotlin.ui.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private var newQuote : Quote = Quote("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quoteViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(QuoteViewModel::class.java)

        newQuote = quoteViewModel.getQuote()
        Log.d("MainActivity", "onCreate: " + newQuote.quoteText)
    }
}
