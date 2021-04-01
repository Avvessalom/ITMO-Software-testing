package part1

import kotlin.math.*

fun mySin(x: Number): Double {
    val fact: (Int) -> Int = { (1..it).fold(1) {acc, i -> acc * i} }
    return generateSequence(0){ n -> n + 1}
        .take(7)
        .map{n -> ((-1.0).pow(n) * x.toDouble().pow(2 * n + 1)) / fact(2 * n + 1)}
        .sum()
}
