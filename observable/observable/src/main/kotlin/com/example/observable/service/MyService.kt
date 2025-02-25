package com.example.observable.service

fun interface MyService {
    suspend fun getUser(id: String): String
}