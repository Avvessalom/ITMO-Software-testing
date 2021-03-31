package util

import logarithmic.LogarithmicFunction
import trigonometric.TrigonometricFunction
import java.io.FileOutputStream
import java.io.PrintStream
import java.nio.file.Files.createDirectories
import java.nio.file.Path
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.util.*

class CSVGenerator(_filepath: String = "src/test/resources/results/") {
    private var filepath = _filepath
    private var filename = "result.csv"
    fun setFilePath(filename: String) {
        this.filename = "${filename}.csv"
    }

    fun generate(func: LogarithmicFunction<Number>, step: Double,
                 lowerBound: Double, upperBound: Double, precision: Double, base: Double) {
        createDirectories(Path.of(filepath))
        val printStream = PrintStream(FileOutputStream(filepath + filename, true))
        printStream.use {
            var x = lowerBound
            while (x < upperBound) {
                val result = func(x, base, precision)
                val csvString = String.format(Locale.US, "%f, %f", x, result)
                printStream.println(csvString)
                x += step
            }
        }
    }

    fun generate(func: TrigonometricFunction<Number>, step: Double, lowerBound: Double, upperBound: Double) {
        createDirectories(Path.of(filepath))
        val printStream = PrintStream(FileOutputStream(filepath + filename, true))
        printStream.use {
            var x = lowerBound
            while (x < upperBound) {
                val result = func(x)
                val csvString = String.format(Locale.US, "%f, %f", x, result)
                printStream.println(csvString)
                x += step
            }
        }
    }
}