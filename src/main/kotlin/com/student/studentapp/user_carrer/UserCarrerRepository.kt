package com.student.studentapp.user_carrer

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserCarrerRepository : JpaRepository<UserCarrer, Long>{
    fun findByCarrerId(carrerId: Long): List<UserCarrer>
}
