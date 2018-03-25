package com.demo.kotlin.controller

import com.demo.kotlin.domain.Persona
import com.demo.kotlin.service.PersonaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class PersonaRestController(val personaService: PersonaService) {

    @GetMapping("personas")
    fun obtenerTodasLasPersonas(): List<Persona> {
        return personaService.buscarTodas()
    } // si es una funcion de varias lineas necesita el return y el tipo de datos de retorno

    // se puede simplificar asi: fun obtenerTodasLasPersonas() = personaService.buscarTodas()

}