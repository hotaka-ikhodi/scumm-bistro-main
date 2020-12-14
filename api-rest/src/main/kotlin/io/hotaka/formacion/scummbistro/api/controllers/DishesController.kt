package io.hotaka.formacion.scummbistro.api.controllers

import io.hotaka.formacion.scummbistro.api.domain.entities.Dish
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/dishes")
class DishesController {

    @GetMapping
    fun findAll(@RequestParam(defaultValue = "0") page: Int,
                @RequestParam(defaultValue = "10") size: Int,
                @RequestParam(defaultValue = "name") sort: String,
                @RequestParam(defaultValue = "asc") direction: String) : Page<Dish>?{
        val paging = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(direction), sort))
        return null
    }
}