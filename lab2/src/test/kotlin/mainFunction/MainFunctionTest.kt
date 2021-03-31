package mainFunction

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals

class MainFunctionTest {

    var mainFunc = MainFunction()

    @Test
    fun `main function test`() = assertAll(
        { assertEquals(Double.NaN, mainFunc(1.0)) },
        { assertEquals(Double.POSITIVE_INFINITY, mainFunc(2.0)) },
        { assertEquals(Double.POSITIVE_INFINITY, mainFunc(3.0)) }
    )

    @Test
    fun `main function test 0`() = assertAll(
        { assertEquals(18.645989, mainFunc(-0.500000), 0.001) },
        { assertEquals(22.631669, mainFunc(-0.400000), 0.001) },
        { assertEquals(30.568353, mainFunc(-0.300000), 0.001) },
        { assertEquals(50.864064, mainFunc(-0.200000), 0.001) },
        { assertEquals(145.599935, mainFunc(-0.100000), 0.001) },
    )
}