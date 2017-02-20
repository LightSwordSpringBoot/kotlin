import kotlin.reflect.KProperty

class Delegate {
    operator fun provideDelegate(thisRef: Any?, property: KProperty<*>) = this
    operator fun getValue(thisRef: Any?, property: KProperty<*>) = "OK"
}

class TestClass {
    companion object {
        val test by Delegate()
    }
}


// TESTED_OBJECT_KIND: property
// TESTED_OBJECTS: TestClass$Companion, $$delegatedProperties
// FLAGS: ACC_FINAL, ACC_SYNTHETIC, ACC_STATIC
