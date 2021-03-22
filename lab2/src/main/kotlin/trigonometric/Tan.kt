package trigonometric

class Tan: TrigonometricFunction<Number> {

    val sin = Sin()
    val cos = Cos()

    override fun invoke(vararg args: Number): Double {

        val x = args[0].toDouble()

        return if (x.isSpecial) x else
            sin(x) / cos (x)
    }
}