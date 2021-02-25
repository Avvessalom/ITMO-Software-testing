import kotlin.math.*

fun mySin(x: Number): Double {
    val fact: (Int) -> Int = { (1..it).fold(1) {acc, i -> acc * i} }
    return generateSequence(0){ n -> n + 1}
        .take(8)
        .map{n -> ((-1.0).pow(n) * x.toDouble().pow(2 * n + 1)) / fact(2 * n + 1)}
        .sum()
}

fun stupidSin(x: Number): Double{
    val fact: (Int) -> Int = { (1..it).fold(1) {acc, i -> acc * i} }
    return (x.toDouble() - x.toDouble().pow(3) / fact(3) + x.toDouble()/ fact(5))
}

fun main() {
    println(mySin(2 * PI / 3))
    println(stupidSin(2 * PI / 3))
}