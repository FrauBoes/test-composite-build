plugins {
    id("java-gradle-plugin")
    id("maven-publish")
}

group = "org.sample"
version = "1.0-SNAPSHOT"

gradlePlugin {
    plugins {
        create("customPlugin") {
            id = "org.sample.greeting"
            implementationClass = "org.sample.GreetingPlugin"
        }
    }
}
