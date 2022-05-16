package com.ligapro.campeonato.repository



import com.ligapro.campeonato.model.Equipo
import org.springframework.data.jpa.repository.JpaRepository

interface EquipoRepository: JpaRepository<Equipo, Long>{
    fun findByIdequipo(idequipo:Long?): Equipo?

}