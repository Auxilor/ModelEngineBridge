group = "com.willfp"
version = rootProject.version

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

tasks.compileKotlin {
    kotlinOptions {
        jvmTarget = "21"
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.8-R0.1-SNAPSHOT")
    compileOnly("com.ticxo.modelengine:ModelEngine:R4.0.4")
    compileOnly(project(":api"))
}
