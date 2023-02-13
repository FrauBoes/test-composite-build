rootProject.name = "my-greeting-app"

pluginManagement {
    repositories {
        mavenLocal()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            plugin("greeting", "org.sample.greeting").version("1.0-SNAPSHOT")
        }
    }
}