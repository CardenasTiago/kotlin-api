package com.student.studentapp.user

import org.springframework.stereotype.Service
import com.student.studentapp.carrer.CarrerRepository
import com.student.studentapp.user_carrer.UserCarrer
import com.student.studentapp.user_carrer.UserCarrerRepository


@Service
class UserService(
    private val userRepository: UserRepository,
    private val carrerRepository: CarrerRepository,
    private val userCarrerRepository: UserCarrerRepository
) {
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

    fun carrerRegister(req: UserCarrerRequest): UserCarrer{
        val user = userRepository.findById(req.userId).orElseThrow{ NoSuchElementException("User not found")}
        val carrer = carrerRepository.findById(req.carrerId).orElseThrow{ NoSuchElementException("Carrer not found")}

        val userCarrer = UserCarrer(user = user, carrer = carrer)
        return userCarrerRepository.save(userCarrer)
    }
}
