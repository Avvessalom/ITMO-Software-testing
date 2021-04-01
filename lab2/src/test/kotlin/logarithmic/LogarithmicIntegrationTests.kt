package logarithmic

import org.mockito.Mockito
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import org.mockito.MockedStatic
import org.mockito.Mockito.mockStatic
import kotlin.test.Test

class LogarithmicIntegrationTests {
    val lnMock = Mockito.mock(Ln::class.java)

    @DisplayName("Logarithm test")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-ln-0.1-0.1-1-result_31.03.2021-18_01.csv"])
    fun `log integration with ln test`(value: Double, answer: Double) {
        val log = Log().apply { ln = lnMock }
        val logTrue = Log()
        Mockito.`when`(lnMock(value)).thenReturn(answer)
        assertEquals(lnMock(value) / lnMock(value), logTrue(value, value))
    }

}