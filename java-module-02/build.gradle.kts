plugins {
    java
}

class SomeLargeObject(
    val data: ByteArray = ByteArray(size = 100 * 1024 * 1024) // 100 Mb
) : java.io.Serializable

tasks.register("someTask") {
    inputs.property("largeObject", SomeLargeObject())
    inputs.property("duration", 5_000L) // 5 sec.
    doLast {
        val largeObject: SomeLargeObject = inputs.properties["largeObject"] as SomeLargeObject
        val duration: Long = inputs.properties["duration"] as Long
        logger.lifecycle("$path start - $largeObject")
        Thread.sleep(duration)
        logger.lifecycle("$path end   - $largeObject")
    }
}
