package com.student.studentapp.user

import org.springframework.stereotype.Service
import java.util.Optional
import kotlin.concurrent.thread

@Service
class UserService(private val userRepository: UserRepository) {
    fun create(user: User): User = userRepository.save(user)
    fun list(): List<User> = userRepository.findAll()
    fun getById(id: Long): User {
        return userRepository.findById(id).orElseThrow {
            NoSuchElementException("Usuario no encontrado con ID: $id")
        }
    }

    fun delete(id: Long) {
        return userRepository.deleteById(id)
    }

    fun getByUsername(username: String): User {
        return userRepository.getByUsername(username)
            ?: throw NoSuchElementException("Usuario no encontrado")
    }

    fun login(userRequest: UserRequest): User {
        val user = getByUsername(userRequest.username)
        if (user.password != userRequest.password) {
            throw IllegalArgumentException("Contraseña incorrecta")
        }
        return user
    }
}
