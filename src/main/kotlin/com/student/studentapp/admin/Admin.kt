package com.student.studentapp.admin

import jakarta.persistence.*

@Entity
@Table(name = "admin")
data class Admin(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "username")
    val userName: String,

    @Column(name = "password")
    val password: String,
    )