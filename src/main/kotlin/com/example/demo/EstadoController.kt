package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class

EstadoController {

    @GetMapping("/status")
    fun status(): Map<String, String> {
        return mapOf("message" to "ok")
    }
}