package com.student.studentapp.carrer

import org.springframework.stereotype.Service
import com.student.studentapp.student.*
import com.student.studentapp.user_carrer.*

@Service
class CarrerService(private val carrerRepository: CarrerRepository, private val userCarrerRepository: UserCarrerRepository) {
    fun create(carrer: Carrer): Carrer = carrerRepository.save(carrer)
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