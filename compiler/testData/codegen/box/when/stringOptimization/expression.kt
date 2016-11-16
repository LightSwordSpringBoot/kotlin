// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND_WITHOUT_CHECK: JS

// WITH_RUNTIME

import kotlin.test.assertEquals

fun foo(x : String) : String {
    return when (x) {
        "abc", "cde" -> "abc_cde"
        "efg", "ghi" -> "efg_ghi"
        else -> "other"
    }
}

fun box() : String {
    assertEquals("abc_cde", foo("abc"))
    assertEquals("abc_cde", foo("cde"))
    assertEquals("efg_ghi", foo("efg"))
    assertEquals("efg_ghi", foo("ghi"))

    assertEquals("other", foo("xyz"))

    return "OK"
}
