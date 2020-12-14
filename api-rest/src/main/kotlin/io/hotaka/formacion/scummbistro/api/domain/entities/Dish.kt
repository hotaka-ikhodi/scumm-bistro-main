package io.hotaka.formacion.scummbistro.api.domain.entities


import javax.persistence.*

@Entity
@Table(name = "platos")
class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    @Column(name = "nombre")
    var nombre: String=""
    @Column(name = "categoria   ")
    var categoria: String=""
}
