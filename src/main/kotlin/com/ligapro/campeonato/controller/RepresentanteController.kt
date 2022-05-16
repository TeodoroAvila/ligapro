package com.ligapro.campeonato.controller

import com.ligapro.campeonato.model.Representante
import com.ligapro.campeonato.service.RepresentanteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/representante")
class RepresentanteController {

    @Autowired
    lateinit var representanteService: RepresentanteService

    @GetMapping
    fun list():List<Representante>{
        return representanteService.list()
    }

    @PostMapping
    fun save(@RequestBody representante: Representante): Representante {
        return representanteService.save(representante)
    }

}