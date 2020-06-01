package com.yussef.dailyquotekotlin.network.responses

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Quote (


    @SerializedName("quoteText")
    @Expose
    var quoteText : String,

    @SerializedName("quoteAuthor")
    @Expose
    var quoteAuthor : String

)