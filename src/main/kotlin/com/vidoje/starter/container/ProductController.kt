package com.vidoje.starter.container

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/products")
class ProductController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAllProducts(): List<String> {
        return listOf("p1", "p2", "p3", "p4", "p5")
    }

}