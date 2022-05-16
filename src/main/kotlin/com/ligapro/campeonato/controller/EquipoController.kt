package com.ligapro.campeonato.controller


import com.ligapro.campeonato.model.Campeonato
import com.ligapro.campeonato.model.Equipo
import com.ligapro.campeonato.service.EquipoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping ("/equipo")

class EquipoController {

    @Autowired
    lateinit var equipoService: EquipoService

    @GetMapping
    fun list ():List<Equipo> {
        return equipoService.list()
    }
    @PostMapping
    fun save (@RequestBody equipo: Equipo):Equipo{
        return equipoService.save(equipo)
    }
    @PutMapping
    fun update (@RequestBody equipo: Equipo):Equipo{
        return equipoService.update(equipo)
    }
    @PatchMapping
    fun updateUno(@RequestBody equipo: Equipo):Equipo{
        return equipoService.updateUno(equipo)
    }
}