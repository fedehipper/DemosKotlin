package com.demo.kotlin.service

import com.demo.kotlin.domain.Persona
import com.demo.kotlin.repository.PersonaRepository
import org.springframework.stereotype.Service

@Service
class PersonaService(val personaRepository: PersonaRepository) {

    fun buscarTodas(): List<Persona> = personaRepository.findAll()

}

