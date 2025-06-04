package com.student.studentapp.admin

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class AdminService(private val adminRepository: AdminRepository){

}