plugins {
    id("org.springframework.boot")

    kotlin("jvm")
    kotlin("plugin.jpa")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    api("org.springframework.boot:spring-boot-starter-data-jpa")
}
