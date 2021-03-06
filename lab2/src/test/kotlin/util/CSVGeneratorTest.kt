package util

import logarithmic.Ln
import logarithmic.Log
import mainFunction.MainFunction
import org.junit.jupiter.api.Test
import trigonometric.*
import java.lang.Math.PI

class CSVGeneratorTest {
    private val generator = CSVGenerator()
    var ln = Ln()
    var log = Log()

    @Test
    fun testLog3() {
        val log = Log()
        generator.setFilePath("test-log3-0.1-0.1-1-result")
        generator.generate(log, 0.1, 0.1, 1.0, 0.1, 3.0)
    }

    @Test
    fun testLog5() {
        val log = Log()
        generator.setFilePath("test-log5-0.1-0.1-1-result")
        generator.generate(log, 0.1, 0.1, 1.0, 0.1, 5.0)
    }
    @Test
    fun testLog10() {
        val log = Log()
        generator.setFilePath("test-log10-0.1-0.1-1-result")
        generator.generate(log, 0.1, 0.1, 1.0, 0.1, 10.0)
    }

    @Test
    fun testLn() {
        val ln = Ln()
        generator.setFilePath("test-ln-0.1-0.1-1-result")
        generator.generate(ln, 0.1, 0.1, 1.0, 0.1, 5.0)
    }

    @Test
    fun testSin() {
        val sin = Sin()
        generator.setFilePath("test-sin-0.1-0-2pi-result")
        generator.generate(sin, 0.1, 0.0, 2*PI)
    }

    @Test
    fun testCos(){
        val cos = Cos()
        generator.setFilePath("test-cos-0.1-0-2pi-result")
        generator.generate(cos, 0.1, 0.0, 2*PI)
    }
    @Test
    fun testCosminus(){
        val cos = Cos()
        generator.setFilePath("test-cos-0.1--1-2pi-result")
        generator.generate(cos, 0.1, -1.0, 2*PI)
    }

    @Test
    fun testTan(){
        val tan = Tan()
        generator.setFilePath("test-tan-0.1-0-2pi-result")
        generator.generate(tan, 0.1, 0.0, 2*PI)
    }
    @Test
    fun testTanminus(){
        val tan = Tan()
        generator.setFilePath("test-tan-0.1--1-2pi-result")
        generator.generate(tan, 0.1, -1.0, 2*PI)
    }

    @Test
    fun testCot(){
        val cot = Cot()
        generator.setFilePath("test-cot-0.1-0-2pi-result")
        generator.generate(cot, 0.1, 0.0, 2*PI)
    }
    @Test
    fun testCotmin(){
        val cot = Cot()
        generator.setFilePath("test-cot-0.1--1-2pi-result")
        generator.generate(cot, 0.1, -1.0, 2*PI)
    }

    @Test
    fun testCsc(){
        val csc = Csc()
        generator.setFilePath("test-csc-0.1-0-2pi-result")
        generator.generate(csc, 0.1, 0.0, 2*PI)
    }
    @Test
    fun testCscminus(){
        val csc = Csc()
        generator.setFilePath("test-csc-0.1--1-2pi-result")
        generator.generate(csc, 0.1, -1.0, 2*PI)
    }

    @Test
    fun testMain(){
        val main = MainFunction()
        generator.setFilePath("test-main")
        generator.generate(main, 0.1, -0.5, 1.0, 0.1, 5.0)
    }
}