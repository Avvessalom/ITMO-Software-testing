package mainFunction

import logarithmic.Ln
import logarithmic.Log
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.mockito.Mockito
import trigonometric.*
import kotlin.math.pow

class MainIntegrationTests {
    val sinMock = Mockito.mock(Sin::class.java)
    val cosMock = Mockito.mock(Cos::class.java)
    val cotMock = Mockito.mock(Cot::class.java)
    val cscMock = Mockito.mock(Csc::class.java)
    val tanMock = Mockito.mock(Tan::class.java)
    val log3Mock = Mockito.mock(Log::class.java)
    val log5Mock = Mockito.mock(Log::class.java)
    val log10Mock = Mockito.mock(Log::class.java)
    var sin = Sin()
    var cos = Cos()
    var tan = Tan()
    var cot = Cot()
    var csc = Csc()
    var ln = Ln()
    var log = Log()

    @DisplayName("main test cos")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-cos-0.1--1-2pi-result.csv"])
    fun `main test sin`(value: Double, answer: Double) {
        val main = MainFunction().apply { cos = cosMock }
        Mockito.`when`(cosMock(value)).thenReturn(answer)
        if (value <= 0) {
            assertEquals(
                ((tan(value) * cosMock(value)) - (csc(value) - cosMock(value)).pow(2) / cot(value)).pow(2),
                main(value),
                0.01
            )
        }
    }

    @DisplayName("main test tan")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-tan-0.1--1-2pi-result.csv"])
    fun `main test tan`(value: Double, answer: Double) {
        val main = MainFunction().apply { tan = tanMock }
        Mockito.`when`(tanMock(value)).thenReturn(answer)
        if (value <= 0) {
            assertEquals(
                ((tanMock(value) * cos(value)) - (csc(value) - cos(value)).pow(2) / cot(value)).pow(2),
                main(value),
                0.01
            )
        }
    }

    @DisplayName("main test cot")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-cot-0.1--1-2pi-result.csv"])
    fun `main test cot`(value: Double, answer: Double) {
        val main = MainFunction().apply { cot = cotMock }
        Mockito.`when`(cotMock(value)).thenReturn(answer)
        if (value <= 0) {
            assertEquals(
                ((tan(value) * cos(value)) - (csc(value) - cos(value)).pow(2) / cotMock(value)).pow(2),
                main(value),
                0.01
            )
        }
    }

    @DisplayName("main test csc")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-csc-0.1--1-2pi-result.csv"])
    fun `main test csc`(value: Double, answer: Double) {
        val main = MainFunction().apply { csc = cscMock }
        Mockito.`when`(cscMock(value)).thenReturn(answer)
        if (value <= 0) {
            assertEquals(
                ((tan(value) * cos(value)) - (cscMock(value) - cos(value)).pow(2) / cot(value)).pow(2),
                main(value),
                0.01
            )
        }
    }

    @DisplayName("main test log3")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-log3-0.1-0.1-1-result.csv"])
    fun `main test log3`(value: Double, answer: Double){
        val main = MainFunction().apply { log = log3Mock }
        Mockito.`when`(log3Mock(value)).thenReturn(answer)
        assertEquals((((( (log3Mock(value) + log(value, 2)) / (log(value, 5).pow(3)) ) + log(value, 10)) + log(value, 10)) / (log(value, 5) - log(value, 5))),
            main(value),
            0.001
        )
    }

    @DisplayName("main test log5")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-log5-0.1-0.1-1-result.csv"])
    fun `main test log5`(value: Double, answer: Double){
        val main = MainFunction().apply { log = log5Mock }
        Mockito.`when`(log5Mock(value)).thenReturn(answer)
        assertEquals((((( (log(value, 3) + log(value, 2)) / (log5Mock(value).pow(3)) ) + log(value, 10)) + log(value, 10)) / (log5Mock(value) - log5Mock(value))),
            main(value),
            0.001
        )
    }

    @DisplayName("main test log10")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-log10-0.1-0.1-1-result.csv"])
    fun `main test log10`(value: Double, answer: Double){
        val main = MainFunction().apply { log = log10Mock}
        Mockito.`when`(log10Mock(value)).thenReturn(answer)
        assertEquals((((( (log(value, 3) + log(value, 2)) / (log(value, 5).pow(3)) ) + log10Mock(value)) + log10Mock(value)) / (log(value, 5) - log(value, 5))),
            main(value),
            0.001
        )
    }
}