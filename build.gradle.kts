buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.google.com")
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
    }
    dependencies {
        classpath("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:2.0.0-Beta1-1.0.15")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}