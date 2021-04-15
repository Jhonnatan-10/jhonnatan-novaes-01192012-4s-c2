package com.example.continuada02

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiCachorro {


    @GET("cachorros/{id}")
        fun get(@Path("id") id:Int): Call<Cachorro>

}