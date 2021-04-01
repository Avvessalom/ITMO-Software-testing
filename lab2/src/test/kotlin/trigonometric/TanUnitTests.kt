package trigonometric

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.math.PI
import kotlin.math.sqrt

class TanUnitTests {
    var tan = Tan()

    @Test
    fun `cot() test`() = assertAll(
        { Assertions.assertEquals(sqrt(3.0) / 3, tan(PI / 6), 0.1) },
        { Assertions.assertEquals(1.0, tan(PI / 4), 0.1) },
        { Assertions.assertEquals(sqrt(3.0), tan(PI / 3), 0.1) },
        { Assertions.assertEquals(-sqrt(3.0), tan( 2 * PI / 3), 0.1) },
        { Assertions.assertEquals(-1.0, tan(3 * PI / 4), 0.1) },
        { Assertions.assertEquals(-sqrt(3.0) / 3, tan(5 * PI / 6), 0.1) },
    )

    @Test
    fun `infinity test`() = assertAll(
        { Assertions.assertEquals(Double.NaN, tan(Double.NaN)) },
        { Assertions.assertEquals(Double.NEGATIVE_INFINITY, tan(Double.NEGATIVE_INFINITY)) },
        { Assertions.assertEquals(Double.POSITIVE_INFINITY, tan(Double.POSITIVE_INFINITY)) }
    )
}