pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        maven("https://repo.jpenilla.xyz/snapshots/")
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "ModelEngineBridge"

// Core
include(":api")
include(":v3")
include(":v4")
