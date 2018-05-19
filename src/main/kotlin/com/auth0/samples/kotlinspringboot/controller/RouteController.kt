package com.auth0.samples.kotlinspringboot.controller

import com.auth0.samples.kotlinspringboot.persistence.RouteRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/routes")
class RouteController(val repository: RouteRepository) {

	@RequestMapping("/id")
	fun answer() = 42
}
