// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND_WITHOUT_CHECK: JS

// WITH_RUNTIME

import kotlin.test.assertEquals

inline fun <R, T> foo(x : R?, y : R?, block : (R?) -> T) : T {
    if (x == null) {
        return block(x)
    } else {
        return block(y)
    }
}

fun box() : String {
    assertEquals(3, foo(1, 2) { x -> if (x != null) 3 else 4 })

    return "OK"
}
