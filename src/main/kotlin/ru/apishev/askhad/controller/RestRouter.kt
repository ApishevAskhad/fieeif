package ru.apishev.askhad.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/human")
class RestRouter {
    @GetMapping
    fun getHuman() = Human("Alex", 25)
}

data class Human(val name: String, val age: Int)