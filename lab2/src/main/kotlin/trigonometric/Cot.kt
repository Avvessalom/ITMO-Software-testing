package trigonometric

class Cot: TrigonometricFunction<Number> {

    var sin = Sin()
    var cos = Cos()

    override fun invoke(vararg args: Number): Double {

        val x = args[0].toDouble()

        return if (x.isSpecial) x else
            cos(x) / sin(x)
    }
}