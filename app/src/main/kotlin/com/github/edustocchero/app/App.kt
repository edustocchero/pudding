package com.github.edustocchero.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EntityScan("com.github.edustocchero.persistence.entities")
@EnableJpaRepositories(basePackages = ["com.github.edustocchero.persistence"])
@SpringBootApplication(scanBasePackages = [
    "com.github.edustocchero",
])
class App

fun main(args: Array<String>) {
    runApplication<App>(*args)
}
