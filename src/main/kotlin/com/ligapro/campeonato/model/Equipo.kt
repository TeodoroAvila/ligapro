package com.ligapro.campeonato.model

import javax.persistence.*

@Entity
@Table(name = "equipo")

class Equipo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var idequipo: Long? = null
    var name: String? = null
    var fundacion: String? = null
    var numerodejugadoree: Long? = null

}