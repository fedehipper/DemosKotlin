package com.demo.kotlin.service

import org.assertj.core.api.Assertions
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class PersonaServiceTest {

    @Autowired
    lateinit var personaService: PersonaService

    @Test
    fun buscarTodas_sinParametros_retornaTodasLasPersonas() {
        Assertions
                .assertThat(personaService.buscarTodas())
                .extracting("nombre")
                .contains("Federico")
    }

}