plugins {
    kotlin("jvm") version "1.9.0"
    application
    id("org.sonarqube") version "4.3.1.3277"
}

sonar {
    properties {
        property("sonar.projectKey", "bhos-qa_l4-branch-coverage-Sadykhzadeh")
        property("sonar.organization", "bhos-qa")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

group = "one.azer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}