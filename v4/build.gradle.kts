group = "com.willfp"
version = rootProject.version

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.8-R0.1-SNAPSHOT")
    compileOnly("com.ticxo.modelengine:ModelEngine:R4.0.4")
    compileOnly(project(":api"))
}
