package trigonometric

class Csc: TrigonometricFunction<Number> {

    var sin = Sin()

    override fun invoke(vararg args: Number): Double {
        val x = args[0].toDouble()

        return if (x.isSpecial) x else
            1.0 / sin(x)
    }
}
