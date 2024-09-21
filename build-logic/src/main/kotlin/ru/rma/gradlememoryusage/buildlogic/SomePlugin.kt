package ru.rma.gradlememoryusage.buildlogic

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

abstract class SomePlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.tasks.register<SomeTask>("someTask") {
            largeObjectProperty.set(SomeLargeObject())
        }
    }
}
