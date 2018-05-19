package com.auth0.samples.kotlinspringboot.persistence

import com.auth0.samples.kotlinspringboot.Route

import org.springframework.data.repository.CrudRepository

interface RouteRepository : CrudRepository<Route, Long>

