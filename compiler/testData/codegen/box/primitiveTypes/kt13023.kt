// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND_WITHOUT_CHECK: JS

// WITH_RUNTIME

import kotlin.test.assertEquals

fun box(): String {
    val b = 'b'
    val c = 'c'
    assertEquals('c', b + 1)
    assertEquals('a', b - 1)
    assertEquals(1, c - b)

    val list = listOf('b', 'a')
    assertEquals('c', list[0] + 1)
    assertEquals('a', list[0] - 1)
    assertEquals(1, list[0] - list[1])
    assertEquals(1, list[0] - 'a')
    assertEquals(1, 'b' - list[1])

    return "OK"
}