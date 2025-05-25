package com.student.studentapp.studentPlan

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentPlanRepository: JpaRepository<StudentPlan, Long>{
}