package com.github.edustocchero.persistence.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
data class Person(
  @Id
  val id: UUID,
  val name: String,
)
