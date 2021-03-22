package trigonometric

import kotlin.math.*

class Cos: TrigonometricFunction<Number> {

    val sin = Sin()

    override fun invoke(vararg args: Number): Double {
        val x = args[0].toDouble()

        return if (x.isSpecial) x else
            sin(x + PI / 2)
    }
}