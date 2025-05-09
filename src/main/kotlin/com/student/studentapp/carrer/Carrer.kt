package com.student.studentapp.carrer

import com.fasterxml.jackson.annotation.JsonIgnore
import com.student.studentapp.user_carrer.UserCarrer
import com.student.studentapp.studentPlan.studentPlan
import  jakarta.persistence.*

@Entity
@Table(name = "app_carrer")
data class Carrer (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "name")
    val name: String,

    @OneToOne
    @JoinColumn(name = "plan_estudio_id")
    val planEstudioId: studentPlan? = null,

    @OneToMany(mappedBy = "carrer", cascade = [CascadeType.ALL], orphanRemoval = true)
    @JsonIgnore
    val userCarrers: MutableList<UserCarrer> = mutableListOf()
)


