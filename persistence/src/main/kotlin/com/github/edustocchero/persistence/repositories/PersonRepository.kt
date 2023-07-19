package com.github.edustocchero.persistence.repositories

import com.github.edustocchero.persistence.entities.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface PersonRepository : JpaRepository<Person, UUID>
