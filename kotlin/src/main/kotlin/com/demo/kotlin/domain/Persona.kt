package com.demo.kotlin.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Persona(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        var nombre: String,
        var apellido: String,
        var edad: Int) {

    constructor() : this(
            id = 0,
            nombre = "",
            apellido = "",
            edad = 0
    )
    // o usar lombok con @NoArgsConstructor

}
