// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND_WITHOUT_CHECK: JS

// WITH_RUNTIME

object A {

    @JvmStatic fun test(b: String = "OK") : String {
        return b
    }
}

fun box(): String {

    if (A.test() != "OK") return "fail 1"

    return "OK"
}
