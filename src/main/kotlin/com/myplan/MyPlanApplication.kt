package com.myplan

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyPlanApplication

fun main(args: Array<String>) {
	runApplication<MyPlanApplication>(*args)
}
