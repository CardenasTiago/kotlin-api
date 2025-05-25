package com.student.studentapp.studentPlan

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/studentPlans")
class StudentPlanController(private val studentPlanService: StudentPlanService) {

    @PostMapping
    fun create(@RequestBody studentPlan: StudentPlan): StudentPlan{
        return studentPlanService.create(studentPlan)
    }
}
