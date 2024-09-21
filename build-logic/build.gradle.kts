plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("SomePlugin") {
            id = "convention.some-task"
            implementationClass = "ru.rma.gradlememoryusage.buildlogic.SomePlugin"
            description = "Plugin register someTask"
            displayName = "Some Plugin"
        }
    }
}
