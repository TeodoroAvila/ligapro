package com.ligapro.campeonato.service

import com.ligapro.campeonato.model.Representante
import com.ligapro.campeonato.repository.RepresentanteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RepresentanteService {
    @Autowired
    lateinit var representanteRepository: RepresentanteRepository

    fun list(): List<Representante>{
        return representanteRepository.findAll()
    }

    fun save (representante: Representante):Representante{
        return representanteRepository.save(representante)
    }

    fun update (representante: Representante):Representante{
        return representanteRepository.save(representante)
    }

}