plugins {
    kotlin("jvm") version "1.6.10"
}

group = "org.example"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation(kotlin("test-junit"))
}