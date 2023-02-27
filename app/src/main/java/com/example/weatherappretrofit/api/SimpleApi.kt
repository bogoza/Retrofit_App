package com.example.weatherappretrofit.api
import com.example.weatherappretrofit.model.Post
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/1")
    suspend fun getPost(): Post
}