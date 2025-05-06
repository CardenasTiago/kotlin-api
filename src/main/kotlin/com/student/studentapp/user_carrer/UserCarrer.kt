package com.student.studentapp.user_carrer

import com.student.studentapp.carrer.Carrer
import com.student.studentapp.user.User
import jakarta.persistence.*

@Entity
@Table(name = "user_carrer") // Cambiado a minúsculas
data class UserCarrer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User,

    @ManyToOne
    @JoinColumn(name = "carrer_id")
    val carrer: Carrer
)