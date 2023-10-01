plugins {
  java
  id("org.springframework.boot") version "3.1.4"
  id("io.spring.dependency-management") version "1.1.3"
  jacoco
  id("org.sonarqube") version "4.3.1.3277"
}


sonar {
  properties {
    property("sonar.projectKey", "bhos-qa_l4-branch-coverage-Sadykhzadeh")
    property("sonar.organization", "bhos-qa")
    property("sonar.host.url", "https://sonarcloud.io")
    property("sonar.scm.forceReloadAll", "true")
    property("sonar.java.coveragePlugin", "jacoco")
    property("sonar.jacoco.reportPath", "build/JaCoCoTest/test")
    property("sonar.junit.reportsPath", "build/test-results/test")
  }
}


jacoco {
  toolVersion = "0.8.8"
  reportsDirectory.set(layout.buildDirectory.dir("reportsJaCoCo"))
}

tasks.test {
  finalizedBy(tasks.jacocoTestReport) // report is always generated after tests run
}
tasks.jacocoTestReport {
  dependsOn(tasks.test) // tests are required to run before generating the report
}

jacoco {
  toolVersion = "0.8.9"
  reportsDirectory.set(layout.buildDirectory.dir("JaCoCoTest"))
}

tasks.jacocoTestReport {
  reports {
    xml.required.set(true)
    csv.required.set(false)
    html.outputLocation.set(layout.buildDirectory.dir("jacocoHtml"))
  }
}


group = "one.azer"
version = "0.0.1-SNAPSHOT"

java {
  sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  developmentOnly("org.springframework.boot:spring-boot-devtools")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
  useJUnitPlatform()
}
