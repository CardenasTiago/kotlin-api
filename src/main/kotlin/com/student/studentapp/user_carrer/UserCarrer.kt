package com.student.studentapp.user_carrer

import com.student.studentapp.carrer.Carrer
import com.student.studentapp.user.User
import com.student.studentapp.user_carrer.UserCarrerId.UserCarrerId
import jakarta.persistence.*

@Entity
@Table(name = "User_Carrer")
data class UserCarrer(
    @EmbeddedId
    val id: UserCarrerId = UserCarrerId(),

    @ManyToOne
    @MapsId
    @JoinColumn(name = "user_id")
    val user: User,

    @ManyToOne
    @MapsId
    @JoinColumn(name = "carrer_id")
    val carrer: Carrer,
)