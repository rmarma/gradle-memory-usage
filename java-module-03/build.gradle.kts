plugins {
    java
    id("convention.some-task")
}

tasks.someTask {
    durationProperty.set(30_000L)
}
