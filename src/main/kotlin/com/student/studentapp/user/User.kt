package com.student.studentapp.user

import com.student.studentapp.user_carrer.UserCarrer
import jakarta.persistence.*

@Entity
@Table(name = "app_user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "name")
    val name: String,

    @Column(name = "lastname")
    val lastName: String,

    @Column(name = "age")
    val age: Int,

    @Column(name = "email")
    val email: String,

    @Column(name = "password")
    val password: String,

    @Column(name = "username")
    val username: String,

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], orphanRemoval = true)
    val userCarrers: MutableList<UserCarrer> = mutableListOf()
)

data class  UserRequest(
    val username: String,
    val password: String,
)