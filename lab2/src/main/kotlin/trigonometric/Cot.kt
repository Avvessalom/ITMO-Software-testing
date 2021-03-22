package trigonometric

class Cot: TrigonometricFunction<Number> {

    val sin = Sin()
    val cos = Cos()

    override fun invoke(vararg args: Number): Double {

        val x = args[0].toDouble()

        return if (x.isSpecial) x else
            cos(x) / sin(x)
    }
}