package trigonometric

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import org.mockito.Mockito
import kotlin.test.assertEquals

class TanIntegrationTests {
    val sinMock = Mockito.mock(Sin::class.java)
    val cosMock = Mockito.mock(Cos::class.java)

    @DisplayName("Tan test")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-sin-0.1-0-2pi-result.csv"])
    fun `tan integration test with sin test` (value: Double, answer: Double) {
        val tan = Tan().apply { sin = sinMock }
        val cos = Cos()
        Mockito.`when`(sinMock(value)).thenReturn(answer)
        assertEquals(sinMock(value) / cos(value), tan(value))
    }

    @DisplayName("Tan test cos")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-cos-0.1-0-2pi-result.csv"])
    fun `tan integration test with cos test` (value: Double, answer: Double) {
        val tan = Tan().apply { cos = cosMock }
        val sin = Sin()
        Mockito.`when`(cosMock(value)).thenReturn(answer)
        assertEquals(sin(value) / cosMock(value), tan(value))
    }
}