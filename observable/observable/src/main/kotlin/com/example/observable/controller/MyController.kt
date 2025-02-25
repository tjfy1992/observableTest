package com.example.observable.controller

import com.example.observable.service.MyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import io.micrometer.observation.annotation.Observed

@RestController
class MyController(private val myService: MyService) {

    @GetMapping("/user")
    @Observed(name="userController", contextualName = "userController")
    suspend fun getUser(): String {
        return myService.getUser("1")
    }
}