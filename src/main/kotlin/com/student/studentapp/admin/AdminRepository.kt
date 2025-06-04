package com.student.studentapp.admin

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Repository
import org.springframework.web.server.ResponseStatusException

@Repository
interface AdminRepository: JpaRepository<Admin, Long>{
}