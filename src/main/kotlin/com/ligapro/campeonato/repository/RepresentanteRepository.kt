package com.ligapro.campeonato.repository

import com.ligapro.campeonato.model.Representante
import org.springframework.data.jpa.repository.JpaRepository

interface RepresentanteRepository:JpaRepository<Representante,Long>{
    fun findByIdrepresentante(idrepresentante:Long?):Representante?
}