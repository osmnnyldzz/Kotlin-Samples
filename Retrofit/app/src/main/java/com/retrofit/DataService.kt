package com.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface DataService {
    @GET("posts")
    fun getDatas():Call<List<Data>>
}