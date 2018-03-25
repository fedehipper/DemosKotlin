package com.demo.kotlin.repository

import com.demo.kotlin.domain.Persona
import org.springframework.data.jpa.repository.JpaRepository

interface PersonaRepository : JpaRepository<Persona, Long>