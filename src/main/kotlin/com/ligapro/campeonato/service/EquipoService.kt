package com.ligapro.campeonato.service


import com.ligapro.campeonato.model.Equipo
import com.ligapro.campeonato.repository.EquipoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody

@Service
class EquipoService {

    @Autowired
    lateinit var equipoRepository: EquipoRepository
    fun list (): List<Equipo>{
        return equipoRepository.findAll()

    }

    fun save (@RequestBody equipo: Equipo): Equipo {
        return equipoRepository.save(equipo)
    }

    fun update (equipo:Equipo):Equipo{

        equipoRepository.findByIdequipo(equipo.idequipo)
            ?: throw Exception()

        return equipoRepository.save(equipo)
    }

    fun updateUno(equipo: Equipo):Equipo{

        val response=equipoRepository.findByIdequipo(equipo.idequipo)
            ?: throw Exception()

        //actualizo solo el nombre
        response.apply {
            name=equipo.name
        }
        return equipoRepository.save(response)

    }

}
