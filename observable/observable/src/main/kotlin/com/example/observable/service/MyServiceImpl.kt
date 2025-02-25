package com.example.observable.service

import com.example.mywebclient.client.MyWebClientService
import io.micrometer.observation.annotation.Observed
import org.springframework.stereotype.Service
//import org.springframework.web.reactive.function.client.WebClient

@Service
class MyServiceImpl(
    private val myWebClientService: MyWebClientService
) : MyService {
    @Observed(name="userService", contextualName = "userService")
    override suspend fun getUser(id: String): String {
        // return "1"
        return myWebClientService.sendRequest()
//        return webClient.get().uri("https://jsonplaceholder.typicode.com/todos/1").retrieve()
//            .bodyToMono(String::class.java).blockOptional().get()
    }
}