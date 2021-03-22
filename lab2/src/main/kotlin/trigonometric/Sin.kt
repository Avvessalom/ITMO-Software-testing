package trigonometric

import kotlin.math.*

class Sin: TrigonometricFunction<Number> {
    override fun invoke(vararg args: Number, presition: Double): Double {
        val fact: (Int) -> Int = { (1..it).fold(1) {acc, i -> acc * i} }
        val x = args[0].toDouble()

        return if (x.isSpecial) x else
            generateSequence(0){ n -> n + 1}
            .take(7)
            .map{n -> ((-1.0).pow(n) * args[0].toDouble().pow(2 * n + 1)) / fact(2 * n + 1)}
            .sum()
    }
}