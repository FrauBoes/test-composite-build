plugins {
    id ("java")
    id ("jvm-test-suite")
    id ("org.sample.greeting").version("1.0-SNAPSHOT")
}

buildscript {
    repositories {
        mavenLocal()
    }
    dependencies {
        classpath("org.sample.greeting:org.sample.greeting.gradle.plugin:1.0-SNAPSHOT")
        classpath(plugin("org.sample.greeting"))
        classpath(plugin("org.sample.greeting", "1.0-SNAPSHOT"))
        classpath(plugin(libs.plugins.greeting))
    }
}

dependencies {
    implementation(plugin("org.sample.greeting", "1.0-SNAPSHOT"))
    implementation(plugin("org.sample.greeting"))
    implementation(plugin(libs.plugins.greeting))
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            dependencies {
                implementation(plugin("org.sample.greeting", "1.0-SNAPSHOT"))
                implementation(plugin("org.sample.greeting"))
                implementation(plugin(libs.plugins.greeting))
            }
        }
    }
}

greeting {
    who.set("Bob")
}
