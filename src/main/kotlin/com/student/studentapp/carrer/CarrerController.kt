package com.student.studentapp.carrer

import com.student.studentapp.user.User
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/carrers")
class CarrerController(private val carrerService: CarrerService) {

    @PostMapping
    fun create(@RequestBody carrer: Carrer) = carrerService.create(carrer)

    @GetMapping
    fun list() = carrerService.list()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Carrer{
        return carrerService.getById(id)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long){
        return carrerService.delete(id)
    }

    @GetMapping("/{id}/users")
    fun getCarrerUsers(@PathVariable id: Long): List<User>{
        return carrerService.getUsersByCarrer(id)
    }
}