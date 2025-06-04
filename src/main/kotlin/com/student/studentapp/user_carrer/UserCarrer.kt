package com.student.studentapp.user_carrer

import com.fasterxml.jackson.annotation.JsonIgnore
import com.student.studentapp.carrer.Carrer
import com.student.studentapp.student.Student
import jakarta.persistence.*

@Entity
@Table(name = "user_carrer")
data class UserCarrer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "student_id")
    val student: Student,

    @ManyToOne
    @JoinColumn(name = "carrer_id")
    val carrer: Carrer
)