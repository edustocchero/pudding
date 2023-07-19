package com.github.edustocchero.app.resources

import com.github.edustocchero.persistence.entities.Person
import com.github.edustocchero.persistence.repositories.PersonRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

import com.github.edustocchero.utils.Functor

@RestController
@RequestMapping("/books")
class BookResource(val personRepository: PersonRepository) {

  @PostMapping
  fun create(@RequestBody request: CreateBookRequest): ResponseEntity<Person> {
    val person = Functor(request).fmap { Person(UUID.randomUUID(), it.name) }
    val saved = personRepository.save(person)
    return ResponseEntity.ok(saved)
  }

  @GetMapping("/{id}")
  fun find(@PathVariable("id") id: UUID): ResponseEntity<Person> {
    val book = personRepository.findById(id)
    if (book.isEmpty) {
      return ResponseEntity.notFound().build()
    }
    return ResponseEntity.ok(book.get())
  }
}

data class CreateBookRequest(val name: String)
