package com.student.studentapp.studentPlan

import jakarta.persistence.*


@Entity
@Table(name = "student_plan")
data class StudentPlan(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "name")
    val name: String,

    @Column(name = "type")
    val type: String,
)