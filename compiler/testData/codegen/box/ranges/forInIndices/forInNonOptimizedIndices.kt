// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND_WITHOUT_CHECK: JS

// WITH_RUNTIME

import kotlin.test.assertEquals

fun sumIndices(coll: Collection<*>?): Int {
    var sum = 0
    for (i in coll?.indices ?: return 0) {
        sum += i
    }
    return sum
}

fun box(): String {
    assertEquals(6, sumIndices(listOf(0, 0, 0, 0)))
    assertEquals(0, sumIndices(null))

    return "OK"
}