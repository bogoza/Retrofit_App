package com.example.weatherappretrofit.repository

import com.example.weatherappretrofit.api.RetrofitInstance
import com.example.weatherappretrofit.model.Post

class Repository {

    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }
}