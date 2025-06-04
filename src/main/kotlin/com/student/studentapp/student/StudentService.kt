package com.student.studentapp.student

import org.springframework.stereotype.Service
import com.student.studentapp.carrer.CarrerRepository
import com.student.studentapp.user_carrer.UserCarrer
import com.student.studentapp.user_carrer.UserCarrerRepository
import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException


@Service
class StudentService(
    private val studentRepository: StudentRepository,
    private val carrerRepository: CarrerRepository,
    private val studentCarrerRepository: UserCarrerRepository
) {
    fun create(user: Student): Student{
        val Suser = user
        if (Suser.name.isBlank() || Suser.email.isBlank() ||Suser.age == 0) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST,"Faltan datos")
        }

        val UserEmial = studentRepository.getByEmail(user.email)
        if(UserEmial != null){
            throw ResponseStatusException(HttpStatus.CONFLICT, "Ya existe un usuario con mismo email")
        }

        return studentRepository.save(user)
    }
    fun list(): List<Student> {
       return studentRepository.findAll()
    }
    fun getById(id: Long): Student {
        return studentRepository.findById(id).orElseThrow {
            NoSuchElementException("Usuario no encontrado con ID: $id")
        }
    }

    fun delete(id: Long) {
        return studentRepository.deleteById(id)
    }

    fun getByEmail(email: String): Student{
        return studentRepository.getByEmail(email)
            ?: throw NoSuchElementException("Usuario no encontrado")
    }

    fun carrerRegister(req: UserCarrerRequest): UserCarrer{
        val user = studentRepository.findById(req.studentId).orElseThrow{ NoSuchElementException("Student not found")}
        val carrer = carrerRepository.findById(req.carrerId).orElseThrow{ NoSuchElementException("Carrer not found")}

        val userCarrer = UserCarrer(student = user, carrer = carrer)
        return studentCarrerRepository.save(userCarrer)
    }
}
