package util

import logarithmic.Log
import org.junit.jupiter.api.Test
import trigonometric.Sin
import java.lang.Math.PI

class CSVGeneratorTest {
    private val generator = CSVGenerator()

    @Test
    fun testLog5() {
        val log = Log()
        generator.setFilePath("test-log5-0.1-0.1-1-result")
        generator.generate(log, 0.1, 0.1, 1.0, 0.1, 5.0)
    }

    @Test
    fun testSin() {
        val sin = Sin()
        generator.setFilePath("test-sin-0.1-0-2pi-result")
        generator.generate(sin, 0.1, 0.0, 2*PI)
    }
}