package com.chonkk.gradlespringbootkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GradleSpringbootKotlinApplication

fun main(args: Array<String>) {
	runApplication<GradleSpringbootKotlinApplication>(*args)
}
