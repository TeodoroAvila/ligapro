package com.ligapro.campeonato.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "campeonato")

class Campeonato {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name: String? = null
    var firstname: String? = null
    var fechanacimiento: String? = null
    var dorsal: Long? = null
    var phone: Long? = null

}