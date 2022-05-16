package com.ligapro.campeonato.service

import com.ligapro.campeonato.model.Campeonato
import com.ligapro.campeonato.model.Equipo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody
import com.ligapro.campeonato.repository.CampeonatoRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.server.ResponseStatusException
import javax.lang.model.element.Name

@Service
class CampeonatoService {

    @Autowired
    lateinit var campeonatoRepository: CampeonatoRepository
    fun list (): List<Campeonato>{
        return campeonatoRepository.findAll()

    }

    fun getById (id: Long):Campeonato? {
        return campeonatoRepository.getById(id)
    }

    fun save (campeonato: Campeonato): Campeonato {
        try {
            campeonato.name?.takeIf { it.trim().isNotEmpty() }
                ?: throw Exception("Campo nombre no debe estar vacio")

            campeonato.firstname?.takeIf {it.trim().isNotEmpty() }
                ?: throw Exception(" firstname no debe estar vacio")

                return campeonatoRepository.save(campeonato)

        }
        catch (ex:Exception){
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message, ex
            )

        }
    }


    /*fun update(campeonato: Campeonato): Campeonato{
        campeonatoRepository.findById(campeonato.id) ?: throw Exception()
        return campeonatoRepository.save(campeonato)
    }*/

    fun updateOne(campeonato: Campeonato): Campeonato {
        val response = campeonatoRepository.findById(campeonato.id)
            ?: throw Exception()
        response.apply {
            name = campeonato.name
        }

        return campeonatoRepository.save(response)
    }

    fun delete (id:Long):Boolean{
        campeonatoRepository.deleteById(id)
        return true
    }

    fun update (campeonato: Campeonato):Campeonato{
        try {
            if (campeonato.name.equals( "")){
                throw Exception("el nombre no puede estar vacio")
            }


            val response = campeonatoRepository.findById(campeonato.id)
                ?: throw  Exception ("El id ${campeonato.id} no existe")
            return campeonatoRepository.save(campeonato)
        }
        catch (ex: Exception){
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message, ex)
        }

    }


}
