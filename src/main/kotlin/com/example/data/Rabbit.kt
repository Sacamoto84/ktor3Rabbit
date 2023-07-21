package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class Rabbit(
    val name: String, //Имя кролика
    val description: String, //Описание
    val imageURL: String
)
