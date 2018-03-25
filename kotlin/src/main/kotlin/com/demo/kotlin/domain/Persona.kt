package com.demo.kotlin.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
class Persona(
        @Id
        @GeneratedValue
        @JsonIgnore
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
