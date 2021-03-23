package logarithmic

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.Assertions.assertEquals

class LogUnitTests {
    val log = Log()

    @Test
    fun `log() base test`() = assertAll(
        { assertEquals(1.0, log(2, 2), 0.1) },
        { assertEquals(1.0, log(3, 3), 0.1) },
        { assertEquals(1.0, log(4, 4), 0.1) }
    )

    @Test
    fun `log() test`() = assertAll(
        { assertEquals(0.6309, log(2, 3), 0.001)},
        { assertEquals(1.2618, log(4, 3), 0.001)},
        { assertEquals(1.4649, log(5, 3), 0.001)},
        { assertEquals(1.6309, log(6, 3), 0.001)},
    )
}