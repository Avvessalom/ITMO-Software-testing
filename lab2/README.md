# Отчёт
Провести интеграционное тестирование программы, осуществляющей вычисление системы функций (в соответствии с вариантом).

![task](/img/task.JPG)

##### UML диаграммы
##### UML диаграмма логарифмов
![](/img/log.JPG)
##### UML диаграмма тригонометрических функций
![](/img/Package trigonometric.png)
##### UML диаграмма основной функции
![](/img/Package mainFunction.png)

##### Пример интеграционных тестов логарифма
```kotlin
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
```

##### Пример интеграционных тестов тригонометрической функции
```kotlin
    @DisplayName("Cos test")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-sin-0.1-0-2pi-result.csv"])
    fun `cos integration with sin test` (value: Double, answer: Double) {
        val cos = Cos().apply { sin = sinMock }
        Mockito.`when`(sinMock(value)).thenReturn(answer)
        assertEquals(sinMock(value + PI / 2), cos(value) )
    }
```

##### Пример интеграционного теста основной функции
```kotlin
    @DisplayName("main test log5")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-log5-0.1-0.1-1-result.csv"])
    fun `main test log5`(value: Double, answer: Double){
        val main = MainFunction().apply { log5 = log5Mock }
        Mockito.`when`(log5Mock(value)).thenReturn(answer)
        assertEquals((((( (log(value, 3) + log(value, 2)) / (log5Mock(value).pow(3)) ) + log(value, 10)) + log(value, 10)) / (log5Mock(value) - log5Mock(value))),
            main(value),
            0.001
        )
    }
```