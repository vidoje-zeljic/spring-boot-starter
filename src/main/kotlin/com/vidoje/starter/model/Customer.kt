package com.vidoje.starter.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Customer(
    @Id
    @GeneratedValue
    val id: Long? = null,
    val name: String? = null
)