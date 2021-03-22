package part1

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

import kotlin.math.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FunctionsTests {


    @Test
    @DisplayName("random numbers")
    fun `mySin(x) algorithm test`() = assertAll(
        { assertEquals(0.09983341664682815, mySin(0.1), 0.001) },
        { assertEquals(0.8414709848079, mySin(1), 0.001) },
    )

    @Test
    @DisplayName("boundary points")
    fun `mySin(x) boundary points test`() = assertAll(
        { assertEquals(-0.0009999998333333417, mySin(-0.001)) },
        { assertEquals(0.0, mySin(0), 0.001) },
        { assertEquals(0.0009999998333333417, mySin(0.001)) },

        { assertEquals(0.9999995000000417, mySin(PI / 2 + 0.001), 0.001) },
        { assertEquals(1.0, mySin(PI / 2), 0.001) },
        { assertEquals(0.9999995000000417, mySin(PI / 2 - 0.001), 0.001) },

        { assertEquals(-0.00999983333416633, mySin(PI + 0.01), 0.01) },
        { assertEquals(0.0, mySin(PI), 0.01) },
        { assertEquals(0.009999833334166574, mySin(PI - 0.01), 0.01) },

        { assertEquals(-0.99999950000004166665, mySin(-1.5697963267948966), 0.001) },
        { assertEquals(-1.0, mySin(-1.5707963267948966), 0.001) },
        { assertEquals(-0.99999950000004166668, mySin(-1.5717963267948966), 0.001) }
    )

    @Test
    @DisplayName("first quarter")
    fun `mySin(x) first quarter test`() = assertAll(
        { assertEquals(0.5, mySin(PI / 6), 0.001) },
        { assertEquals(sqrt(2.0) / 2, mySin(PI / 4), 0.001) },
        { assertEquals(sqrt(3.0) / 2, mySin(PI / 3), 0.001) },
    )

    @Test
    @DisplayName("second quarter")
    fun `mySin(x) second quarter test`() = assertAll(
        { assertEquals(sqrt(3.0) / 2, mySin(2 * PI / 3), 0.001) },
        { assertEquals(sqrt(2.0) / 2, mySin(3 * PI / 4), 0.001) },
        { assertEquals(0.5, mySin(5 * PI / 6), 0.001) }
    )

    @Test
    @DisplayName("third quarter")
    fun `mySin(x) third quarter test`() = assertAll(
        { assertEquals(-0.5, mySin(7 * PI / 6), 0.01) },
        { assertEquals(-1 * sqrt(2.0) / 2, mySin(5 * PI / 4), 0.1) },
        { assertEquals(-sqrt(3.0) / 2, mySin(4 * PI / 3), 0.1) }
    )

    @Test
    @DisplayName("forth quarter")
    fun `mySin(x) forth quarter test`() = assertAll(
        { assertEquals(-1 * sqrt(3.0) / 2, mySin(-1.04719), 0.001) },
        { assertEquals(-sqrt(2.0) / 2, mySin(-0.7853981633974486), 0.001) },
        { assertEquals(-0.5, mySin(-0.523599), 0.001) }
    )

    @Test
    fun `infinity test mySin()`() = assertAll(
        { assertEquals(Double.NaN, mySin(Double.POSITIVE_INFINITY)) },
        { assertEquals(Double.NaN, mySin(Double.POSITIVE_INFINITY))},
        { assertEquals(Double.NaN, mySin(Double.NaN)) }
    )
}
