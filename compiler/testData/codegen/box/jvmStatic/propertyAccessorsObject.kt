// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND_WITHOUT_CHECK: JS

// WITH_RUNTIME

var result = "fail 2"
object Foo {
    @JvmStatic
    private val a = "OK"

    val b = { a }
    val c = Runnable { result = a }
}

fun box(): String {
    if (Foo.b() != "OK") return "fail 1"

    Foo.c.run()

    return result
}
