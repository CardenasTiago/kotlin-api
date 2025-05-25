package com.student.studentapp.studentPlan

import org.springframework.stereotype.Service

@Service
class StudentPlanService(private val studentPlanRepository: StudentPlanRepository) {
    fun create(studentPlan: StudentPlan): StudentPlan{
        return studentPlanRepository.save(studentPlan)
    }
}