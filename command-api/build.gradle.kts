plugins {
    id("java")
    id("org.springframework.boot") version "3.2.3"
    id("io.spring.dependency-management") version "1.1.4"
    id("com.diffplug.spotless") version "6.25.0"
}

apply(from = "../gradle/spotless.gradle")

group = "com.rangerforce"
version = "0.0.1-SNAPSHOT"

sourceCompatibility = JavaVersion.VERSION_17

configurations {
    compileOnly {
        extendsFrom(annotationProcessor)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // SpringBoot
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.kafka:spring-kafka")

    // Lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    // Spring Test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.kafka:spring-kafka-test")
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        lifecycle {
            events = listOf("passed", "skipped", "failed")
            exceptionFormat = TestLogging.ExceptionFormat.FULL
            showCauses = true
            showExceptions = true
            showStackTraces = false
            showStandardStreams = false // true -> will display all info regarding failing tests
        }
        info.events = lifecycle.events
        info.exceptionFormat = lifecycle.exceptionFormat
    }
}
