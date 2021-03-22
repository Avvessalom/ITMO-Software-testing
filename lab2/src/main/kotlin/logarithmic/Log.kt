package logarithmic

class Log: LogarithmicFunction<Number> {

    var ln = Ln()

    override fun invoke(vararg args: Number, precision: Double): Double {
        if (args.size < 2) throw IllegalArgumentException("Two arguments!!! Parameter and Base")
        val (x, base) = args.map { it.toDouble() }
        return if (x <= 0 || x.isSpecial) Double.NaN else
            ln(x, precision=precision) / ln(base, precision=precision)
    }
}