plugins {
    kotlin("jvm") version "1.9.0"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "me.pliexe"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven(url = "https://repo.codemc.org/repository/nms/")
    maven(url = "https://repo.extendedclip.com/content/repositories/placeholderapi/")
}

dependencies {
    testImplementation(kotlin("test"))

//    compileOnly("org.bukkit:bukkit:1.17.1-R0.1-SNAPSHOT")
    implementation("org.spigotmc:spigot:1.8-R0.1-SNAPSHOT")
    implementation("me.clip:placeholderapi:2.11.1")

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}