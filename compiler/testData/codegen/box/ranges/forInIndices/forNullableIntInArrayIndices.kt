// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND_WITHOUT_CHECK: JS

// WITH_RUNTIME

import kotlin.test.assertEquals

fun suppressBoxingOptimization(ni: Int?) {}

fun box(): String {
    var sum = 0
    for (i: Int? in arrayOf("", "", "", "").indices) {
        suppressBoxingOptimization(i)
        sum += i ?: 0
    }
    assertEquals(6, sum)

    return "OK"
}