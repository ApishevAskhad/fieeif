package ru.apishev.askhad.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WebController {
    @GetMapping("/")
    fun index(): String {
        return "index"
    }
}