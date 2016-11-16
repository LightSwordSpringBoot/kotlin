// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND_WITHOUT_CHECK: JS

// WITH_RUNTIME

import kotlin.test.assertEquals

fun Collection<Int>.sumIndices(): Int {
    var sum = 0
    for (i in indices) {
        sum += i
    }
    return sum
}

fun box(): String {
    val list = listOf(0, 0, 0, 0)
    val sum = list.sumIndices()
    assertEquals(6, sum)

    return "OK"
}