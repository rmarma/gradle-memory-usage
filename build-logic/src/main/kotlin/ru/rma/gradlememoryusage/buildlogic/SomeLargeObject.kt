package ru.rma.gradlememoryusage.buildlogic

import java.io.Serializable

class SomeLargeObject(val data: ByteArray = ByteArray(100 * 1024 * 1024)) : Serializable
