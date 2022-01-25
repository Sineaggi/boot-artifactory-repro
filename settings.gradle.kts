pluginManagement {
    plugins {
        id("io.spring.dependency-management") version "1.0.10.RELEASE"
        id("com.jfrog.artifactory") version "4.26.2"
    }
}

rootProject.name = "repro"
include("lib", "lib2")
