package com.auth0.samples.kotlinspringboot.persistence

import com.auth0.samples.kotlinspringboot.Customer

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long>

