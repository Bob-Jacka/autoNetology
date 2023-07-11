plugins {
    id("java")
}

group = "ru.netology.service"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("junit:junit:4.13.1")
}

tasks.test {
    useJUnit()
}