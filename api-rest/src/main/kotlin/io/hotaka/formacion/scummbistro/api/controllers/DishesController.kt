package io.hotaka.formacion.scummbistro.api.controllers

import io.hotaka.formacion.scummbistro.api.domain.entities.Dish
import io.hotaka.formacion.scummbistro.api.domain.repositories.IDishRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/dishes")
class DishesController(val dishRepository: IDishRepository) {

    @GetMapping
    fun findAll(@RequestParam(defaultValue = "0") page: Int,
                @RequestParam(defaultValue = "10") size: Int,
                @RequestParam(defaultValue = "name") sort: String,
                @RequestParam(defaultValue = "asc") direction: String) : Page<Dish>?{
        val paging = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(direction), sort))
        return null
    }
    @PostMapping
    fun saveDish(@RequestBody dish: Dish) : Dish?{
       return dishRepository.save(dish)
    }
    @PutMapping("/{id}")
    fun updateDish(@PathVariable(value = "id") id: Long, @RequestBody dishDetail: Dish): Dish?{
        val dish: Dish = dishRepository.findById(id).orElse(null)

        dish.nombre= dishDetail.nombre
        dish.categoria= dishDetail.categoria
        return dishRepository.save(dish)
    }
    @DeleteMapping("/{id}")
    fun deleteDish(@PathVariable(value = "id") id: Long): ResponseEntity<*>?{
        val dish: Dish = dishRepository.findById(id).orElse(null)
        dishRepository.delete(dish)
        return ResponseEntity.ok().build<Any>();
    }
}