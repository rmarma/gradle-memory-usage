plugins {
    java
    id("convention.some-task")
}

tasks.someTask {
    durationProperty.set(5_000L)
}
