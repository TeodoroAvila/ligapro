package com.ligapro.campeonato.controller

import com.ligapro.campeonato.model.Campeonato
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.ligapro.campeonato.service.CampeonatoService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping ("/campeonato")

class CampeonatoController {

    @Autowired
    lateinit var campeonatoService: CampeonatoService

    @GetMapping
    fun list ():List<Campeonato> {
        return campeonatoService.list()


    }

    @GetMapping("/id")
    fun listById(@PathVariable("id") id: Long):Campeonato?{
        return campeonatoService.getById(id)
    }


    @PostMapping
    fun save (@RequestBody campeonato: Campeonato):Campeonato{
        return campeonatoService.save(campeonato)
    }

    @PutMapping
    fun update(@RequestBody campeonato: Campeonato): Campeonato{
        return campeonatoService.update(campeonato)
    }

    @PatchMapping
    fun updateOne (@RequestBody campeonato: Campeonato): Campeonato{
        return campeonatoService.updateOne(campeonato)
    }


    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return campeonatoService.delete(id)

    }


}