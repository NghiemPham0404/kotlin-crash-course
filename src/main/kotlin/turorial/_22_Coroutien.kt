package turorial

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Coroutine is a lightweight thread, allow you to suspend and jump to other tasks without
 * block the main thread
 * */

// In build.gradle.kts (Kotlin DSL)
//implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")

/**
 * Explanation:
 * - runBlocking: Run coroutine inside main, block until the task is done
 * - launch: Create new coroutine (non-block)
 * - delay(1000L): Stop coroutine for 1 second
 * - async: Return <Deferred>, use to get a result (like Future)
 * */

suspend fun fetchData(): String {
    delay(2000)
    return "Data from server"
}

fun main() = runBlocking {

    // TODO : simple example
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")

    // TODO : Real practice
    val data = async { fetchData() }
    println("Loading...")
    println("Result: ${data.await()}")
}
