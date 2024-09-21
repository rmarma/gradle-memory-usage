package ru.rma.gradlememoryusage.buildlogic

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault

@DisableCachingByDefault
abstract class SomeTask : DefaultTask() {

    @get:Input
    abstract val largeObjectProperty: Property<SomeLargeObject>

    @get:Input
    abstract val durationProperty: Property<Long>

    @TaskAction
    fun action() {
        val largeObject = largeObjectProperty.get()
        val duration = durationProperty.get()
        logger.lifecycle("$path - start - $largeObject")
        Thread.sleep(duration)
        logger.lifecycle("$path - end   - $largeObject")
    }
}
