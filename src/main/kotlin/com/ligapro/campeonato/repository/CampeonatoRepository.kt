package com.ligapro.campeonato.repository

import com.ligapro.campeonato.model.Campeonato
import org.springframework.data.jpa.repository.JpaRepository

interface CampeonatoRepository:JpaRepository<Campeonato,Long>{
    fun findById(id:Long?):Campeonato?
}