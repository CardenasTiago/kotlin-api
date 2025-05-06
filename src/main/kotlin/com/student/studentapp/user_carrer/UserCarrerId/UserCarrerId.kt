package com.student.studentapp.user_carrer.UserCarrerId

import jakarta.persistence.Embeddable
import  java.io.Serializable

@Embeddable
data class UserCarrerId (
    val UserId: Long = 0,
    val CarrerId: Long = 0
): Serializable