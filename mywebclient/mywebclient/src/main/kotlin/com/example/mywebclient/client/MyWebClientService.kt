package com.example.mywebclient.client

import io.micrometer.observation.annotation.Observed
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Component
class MyWebClientService(private val webClient: WebClient) {
    @Observed(name="myWebClient", contextualName = "myWebClient")
    suspend fun sendRequest(): String {
            return webClient.get().uri("https://jsonplaceholder.typicode.com/todos/1").retrieve()
                .bodyToMono(String::class.java).blockOptional().get()
    }
}