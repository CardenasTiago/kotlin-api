package com.student.studentapp.carrer

import org.springframework.stereotype.Service
import com.student.studentapp.student.*
import com.student.studentapp.user_carrer.*
import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

@Service
class CarrerService(private val carrerRepository: CarrerRepository, private val userCarrerRepository: UserCarrerRepository) {
    fun create(carrer: Carrer): Carrer{
        val sCarrer = carrer

        val carrerExist = carrerRepository.findByName(carrer.name)
        if(carrerExist != null){
            throw ResponseStatusException(HttpStatus.CONFLICT, "Ya existe una carrera con ese nombre")
        }
        return carrerRepository.save(carrer)
    }
    fun list():List<Carrer> = carrerRepository.findAll()
    fun getById(id : Long): Carrer{
        return carrerRepository.findById(id).orElseThrow{
            NoSuchElementException("Carrera no encontrada")
        }
    }

    fun delete(id: Long){
        return carrerRepository.deleteById(id)
    }

    fun getUsersByCarrer(carrerId: Long): List<Student>{
       val userCarrer = userCarrerRepository.findByCarrerId(carrerId)
        return userCarrer.map { it.student }
    }

}