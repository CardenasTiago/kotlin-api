package com.student.studentapp.carrer

import  jakarta.persistence.*

@Entity
@Table(name = "app_carrer")
data class Carrer (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "name")
    val name: String,

    @Column(name = "plan_estudio")
    val planEstudioId: Long? = null,
)


