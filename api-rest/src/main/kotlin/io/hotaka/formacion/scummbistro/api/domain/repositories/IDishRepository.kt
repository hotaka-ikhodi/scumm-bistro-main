package io.hotaka.formacion.scummbistro.api.domain.repositories

import io.hotaka.formacion.scummbistro.api.domain.entities.Dish
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IDishRepository : JpaRepository<Dish, Long> {

}