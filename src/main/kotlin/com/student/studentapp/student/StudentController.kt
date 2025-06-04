package com.student.studentapp.student

import com.student.studentapp.user_carrer.UserCarrer
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController(private val studentService: StudentService) {

    @PostMapping
    fun create(@RequestBody user: Student): Student{
        return studentService.create(user)
    }

    @GetMapping
    fun list() = studentService.list()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Student {
        return studentService.getById(id)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long){
        return studentService.delete(id)
    }

    @PostMapping("/enroll")
    fun carrerRegister(@RequestBody request: UserCarrerRequest): UserCarrer {
        return studentService.carrerRegister(request)
    }


}