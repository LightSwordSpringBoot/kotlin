// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND_WITHOUT_CHECK: JS

// WITH_RUNTIME
// FILE: box.kt

package test

import a.foo

fun box(): String = foo { "OK" }

// FILE: foo.kt

@file:[JvmName("A") JvmMultifileClass]
package a

inline fun foo(body: () -> String): String = zee(body())

// FILE: zee.kt

@file:[JvmName("A") JvmMultifileClass]
package a

public fun zee(x: String): String = x
