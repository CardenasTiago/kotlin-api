package com.student.studentapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.student.studentapp") // Añade esta línea
class StudentappApplication

fun main(args: Array<String>) {
	runApplication<StudentappApplication>(*args)
}
