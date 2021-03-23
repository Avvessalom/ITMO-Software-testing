package trigonometric

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertAll
import kotlin.math.PI
import kotlin.math.sqrt

class CotUnitTests {
    var cot = Cot()

    @Test
    fun `cot() test`() = assertAll(
        { assertEquals(sqrt(3.0), cot(PI / 6), 0.01) },
        { assertEquals(1.0, cot(PI / 4), 0.01) },
        { assertEquals(sqrt(3.0) / 3, cot(PI / 3), 0.01) },
        { assertEquals(-sqrt(3.0) / 3, cot( 2 * PI / 3), 0.01) },
        { assertEquals(-1.0, cot(3 * PI / 4), 0.1) },
        { assertEquals(-sqrt(3.0), cot(5 * PI / 6), 0.1) },
    )

    @Test
    fun `infinity test`() = assertAll(
        { assertEquals(Double.NaN, cot(Double.NaN)) },
        { assertEquals(Double.NEGATIVE_INFINITY, cot(Double.NEGATIVE_INFINITY)) },
        { assertEquals(Double.POSITIVE_INFINITY, cot(Double.POSITIVE_INFINITY)) }
    )
}