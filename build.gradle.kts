plugins {
    kotlin("js") version "1.5.0"
}

group = "me.user"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-js"))
}

kotlin {
    js(LEGACY) {
        binaries.executable()
        nodejs {
            
        }
    }
}