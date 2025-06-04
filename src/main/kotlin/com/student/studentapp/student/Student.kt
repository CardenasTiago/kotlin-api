package com.student.studentapp.student

import com.fasterxml.jackson.annotation.JsonIgnore
import com.student.studentapp.user_carrer.UserCarrer
import jakarta.persistence.*

@Entity
@Table(name = "student")
data class Student(
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

    @Column(name = "legajo")
    val legajo: Int,

    @OneToMany(mappedBy = "student", cascade = [CascadeType.ALL], orphanRemoval = true)
    @JsonIgnore
    val studentCarrers: MutableList<UserCarrer> = mutableListOf()
)


data class UserCarrerRequest(
    val studentId: Long,
    val carrerId: Long
)


