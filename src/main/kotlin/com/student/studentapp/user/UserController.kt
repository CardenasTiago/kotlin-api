package com.student.studentapp.user

import com.student.studentapp.user_carrer.UserCarrer
import org.intellij.lang.annotations.Pattern
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @PostMapping
    fun create(@RequestBody user: User) = userService.create(user)

    @GetMapping
    fun list() = userService.list()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): User {
        return userService.getById(id)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long){
        return userService.delete(id)
    }

    @PostMapping("/login")
    fun login(@RequestBody userRequest: UserRequest): User{
        return userService.login(userRequest)
    }

    @PostMapping("/enroll")
    fun carrerRegister(@RequestBody request: UserCarrerRequest): UserCarrer {
        return userService.carrerRegister(request)
    }


}