package com.student.studentapp.user_carrer.UserCarrerId

import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import  java.io.Serializable

@Embeddable
data class UserCarrerId(
    @Column(name = "student_id")
    val studentId: Long = 0,

    @Column(name = "carrer_id")
    val carrerId: Long = 0
) : Serializable