package com.student.studentapp.carrer

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CarrerRepository: JpaRepository<Carrer, Long> {
    fun findByName(name: String): Carrer?
}