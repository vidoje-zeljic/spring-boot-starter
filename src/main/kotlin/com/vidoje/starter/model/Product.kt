package com.vidoje.starter.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Product {
    @Id
    @GeneratedValue
    private val id: Long? = null
    private val description: String? = null
    private val price: Float? = null
}