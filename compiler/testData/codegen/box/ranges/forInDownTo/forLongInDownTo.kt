// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND_WITHOUT_CHECK: JS

// WITH_RUNTIME

import kotlin.test.assertEquals

fun box(): String {
    var sum = 0L
    for (i in 4L downTo 1L) {
        sum = sum * 10L + i
    }
    assertEquals(4321L, sum)

    return "OK"
}