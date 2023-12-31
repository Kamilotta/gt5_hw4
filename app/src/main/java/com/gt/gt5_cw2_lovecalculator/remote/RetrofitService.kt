package com.gt.gt5_cw2_lovecalculator.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object  RetrofitService {
    var retrofit= Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var api= retrofit.create(LoveApi::class.java)
}