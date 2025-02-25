package com.example.observable

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.EnableAspectJAutoProxy
import reactor.core.publisher.Hooks

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan(basePackages = ["com.example.observable", "com.example.mywebclient"])
class ObservableApplication
    fun main(args: Array<String>) {
        Hooks.enableAutomaticContextPropagation()
        runApplication<ObservableApplication>(*args)
    }



