package com.ligapro.campeonato.model

import javax.persistence.*

@Entity
@Table(name = "representante")
class Representante {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var idrepresentante: Long? = null
    var name: String? = null
    var firstname: String? = null
    //var idjugador: Long? = null
    var phone: Long? = null


}