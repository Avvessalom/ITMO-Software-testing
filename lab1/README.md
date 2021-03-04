## Отчёт

### Часть 1
Для функции `sin(x)` провести модульное тестирование разложения функции в степенной ряд. Выбрать достаточное тестовое покрытие;

Тестовое покрытие обрабатывает всю тригонометрическую окружность

![тригонометрическая окружность](https://github.com/Avvessalom/ITMO-Software-testing/blob/master/lab1/img/img1.jpg?raw=true)

Пример тестов одной четверти
```kotlin
    @Test fun `mySin(x) first quarter test` () = assertAll(
        { assertEquals(0.5, mySin(PI / 6), 0.001) },
        { assertEquals(sqrt(2.0) / 2, mySin(PI / 4), 0.001) },
        { assertEquals(sqrt(3.0) / 2, mySin(PI / 3), 0.001) },
        )
```

### Часть 2
Провести модульное тестирование алгоритма BFS (обход ориентированного графа в ширину). Для этого выбрать характерные точки внутри алгоритма, и для предложенных самостоятельно наборов исходных данных записать последовательность попадания в характерные точки. Сравнить последовательность попадания с эталонной;

#### Варианты графов:
Маленький

![маленький граф](https://github.com/Avvessalom/ITMO-Software-testing/blob/master/lab1/img/graph_min.png?raw=true)

Большой

![большой граф](https://github.com/Avvessalom/ITMO-Software-testing/blob/master/lab1/img/graph_max.png?raw=true)

#### Пример теста

```kotlin
    @Test
    fun `test small graph breadcrumbs with path 0--0` () {
        val expectedPath = ArrayList<IntArray>()
        expectedPath.add(intArrayOf(0, 0))

        val path = search(0, 0, smallGraph)
        val stringPath = createStringPath(path)
        for (node in expectedPath) {
            Assertions.assertTrue(stringPath.contains(node[0].toString() + node[1].toString()))
        }
    }
```

### Часть 3
Сформировать доменную модель для заданного текста.  Разработать тестовое покрытие для данной доменной модели

Описание предметной области

Голова робота, сидящего в углу, сначала резко дернулась вверх, а затем едва заметно закачалась из стороны в сторону. Он тяжело поднялся на ноги и сделал то, что показалось бы постороннему наблюдателю героической попыткой пересечь комнату. Он остановился перед Триллиан и посмотрел, как будто, сквозь ее левое плечо.

##### UML диаграмма разработанной предметной области

![uml](https://github.com/Avvessalom/ITMO-Software-testing/blob/master/lab1/img/UML.PNG?raw=true)

Пример теста
```kotlin
    @Test
    fun `test robot getup`() {
        assertEquals("жоска поднялся из ${testPlase.toString()} на ${testLeg.toString()}.",
            testRobot.getUp(testPlase, "жоска", testLeg))
```