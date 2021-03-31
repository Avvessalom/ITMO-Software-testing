package mainFunction

import logarithmic.*
import trigonometric.*
import kotlin.math.pow

class MainFunction: LogarithmicFunction<Number> {
    var sin = Sin()
    var cos = Cos()
    var tan = Tan()
    var cot = Cot()
    var csc = Csc()
    var ln = Ln()
    var log = Log()

    override fun invoke(vararg args: Number, precision: Double): Double{
        val x = args[0].toDouble()
        val p = precision
        return if (x <=  0)
            ((tan(x) * cos(x)) - (csc(x) - cos(x)).pow(2) / cot(x)).pow(2)
        else
            (((( (log(x, 3) + log(x, 2)) / (log(x, 5).pow(3)) ) + log(x, 10)) + log(x, 10)) / (log(x, 5) - log(x, 5)))
    }
}