package com.student.studentapp.carrer

import org.springframework.stereotype.Service

@Service
class CarrerService(private val carrerRepository: CarrerRepository) {
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

}