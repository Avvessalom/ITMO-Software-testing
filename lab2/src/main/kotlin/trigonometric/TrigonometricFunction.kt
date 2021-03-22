package trigonometric

interface TrigonometricFunction<N: Number?> {
    companion object {
        const val PRESITION = 0.0000001
        const val MAX_ITERATIONS = 1_000_000
    }

    val Number.isSpecial: Boolean
        get() = this in setOf(Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY)

    operator fun invoke(vararg args: N, presition: Double = PRESITION): Double
}