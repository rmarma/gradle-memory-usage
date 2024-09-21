plugins {
    java
    id("convention.some-task")
}

tasks.someTask {
    durationProperty.set(1_000L)
}
