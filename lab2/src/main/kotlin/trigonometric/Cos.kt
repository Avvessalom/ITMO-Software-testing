package trigonometric

import kotlin.math.*

class Cos: TrigonometricFunction<Number> {
    override fun invoke(vararg args: Number): Double {
        val x = args[0].toDouble()
        val sin = Sin()
        return if (x.isSpecial) x else
            sin(x + PI / 2)
    }
}