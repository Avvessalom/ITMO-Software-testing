package trigonometric

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.math.PI
import kotlin.math.sqrt

class CscUnitTests {
    val csc = Csc()

    @Test
    fun `csc test`() = assertAll(
        { assertEquals(Double.POSITIVE_INFINITY, csc(0)) },
        { assertEquals(2.0, csc(PI / 6), 0.01) },
        { assertEquals(sqrt(2.0), csc(PI / 4), 0.01) },
        { assertEquals(2.0 * sqrt(3.0) / 3, csc(PI / 3), 0.01) },
        { assertEquals(1.0, csc(PI / 2), 0.01) }
    )

    @Test
    fun `csc infinity test`() = assertAll(
        { assertEquals(Double.POSITIVE_INFINITY, csc(Double.POSITIVE_INFINITY)) },
        { assertEquals(Double.NEGATIVE_INFINITY, csc(Double.NEGATIVE_INFINITY)) },
        { assertEquals(Double.NaN, csc(Double.NaN)) }
    )
}