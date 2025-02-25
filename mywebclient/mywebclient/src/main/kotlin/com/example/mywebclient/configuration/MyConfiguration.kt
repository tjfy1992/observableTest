package com.example.mywebclient.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient


@Configuration(proxyBeanMethods = false)
class MyConfiguration {
    @Bean
    fun webClient(builder: WebClient.Builder): WebClient = builder.build()
}