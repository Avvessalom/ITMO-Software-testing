package part3

import org.junit.jupiter.api.*
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DomainModelTests {
    lateinit var testHuman: Human
    lateinit var testRobot: Robot
    lateinit var trilian: Human
    lateinit var testPlase: Place
    lateinit var testPlase1: Place
    lateinit var testLeg: LegOfRobot
    lateinit var testHead: HeadOfRobot

    @BeforeEach
    fun init() {
        testHuman = Human("testHuman", 10)
        testRobot = Robot("testRobot")
        trilian = Human("Триллиан", 10)
        testPlase = Place("угол")
        testPlase1 = Place("test")
        testLeg = LegOfRobot("test")
        testHead = HeadOfRobot("test")
    }

    @Test
    @DisplayName("Human is alien")
    fun `human is alien`() = assertAll(
        {
            assertTrue { testHuman.seem(testHuman.isAlienWatcher) }
        },
        {
            testHuman.isAlienWatcher = true
            assertTrue { testHuman.seem(testHuman.isAlienWatcher) }
        },
        {
            testHuman.isAlienWatcher = false
            assertTrue { testHuman.seem(testHuman.isAlienWatcher) }
        })

    @Test
    @DisplayName("Trillian is alien")
    fun `trillian is alien`() = assertAll(
        {
            assertTrue { trilian.seem(trilian.isAlienWatcher) }
        },

        {
            trilian.isAlienWatcher = true
            assertTrue { trilian.seem(trilian.isAlienWatcher) }
        },

        {
            trilian.isAlienWatcher = false
            assertFalse { trilian.seem(trilian.isAlienWatcher) }
        }
    )

    @Test
    @DisplayName("stop robot")
    fun `test stop robot`() = assertAll(
        { assertEquals("Остановился перед ${trilian.toString()}.", testRobot.stop(trilian)) },
        { assertEquals("Остановился перед ${testHuman.toString()}.", testRobot.stop(testHuman))}
    )

    @Test
    @DisplayName("robot sit")
    fun `test robot sit`() = assertAll(
        { assertEquals("сидит в ${testPlase.toString()}. ", testRobot.sit(testPlase)) },
        { assertEquals("сидит в ${testPlase1.toString()}. ", testRobot.sit(testPlase1))}
    )

    @Test
    @DisplayName("robot getup")
    fun `test robot getup`() = assertAll(
        { assertEquals("жоска поднялся из ${testPlase.toString()} на ${testLeg.toString()}.",
            testRobot.getUp(testPlase, "жоска", testLeg)) },
        { assertEquals("тест поднялся из ${testPlase1.toString()} на ${testLeg.toString()}.",
            testRobot.getUp(testPlase1, "тест", testLeg))}
    )

    @Test
    @DisplayName("robot try to go")
    fun `test try to go`() = assertAll(
        { assertEquals(" героическая попытка пересечь ${testPlase.toString()}.", testRobot.tryToGo(testPlase)) },
        { assertEquals(" героическая попытка пересечь ${testPlase1.toString()}.", testRobot.tryToGo(testPlase1))}
    )

    @Test
    @DisplayName("robot watch")
    fun `test watch`() = assertAll(
        { assertEquals("Смотреть сквозь левое плечо ${testHuman.toString()}", testRobot.watch(testHuman)) },
        { assertEquals("Смотреть сквозь левое плечо ${trilian.toString()}", testRobot.watch(trilian)) }
    )

    @Test
    @DisplayName("robot name")
    fun `test robot name`() = assertAll(
        { assertEquals("Робот ", testRobot.toString()) },
        { assertNotEquals("Виталя", testRobot.toString()) }
    )

    @Test
    @DisplayName("robot head action")
    fun `test robot head action`() = assertAll(
        { assertEquals("Голова робота спокойно не двигалась. ", testHead.action("спокойно", "не двигалась")) },
        { assertEquals("Голова робота резко дернулась вверх. ", testHead.action("резко", "дернулась вверх")) },
        { assertEquals("Голова робота внезапно ринулась в пляс. ", testHead.action("внезапно", "ринулась в пляс")) }
    )
    @Test
    @DisplayName("robot head name")
    fun `test robot head name` () {
        assertEquals("Голова", testHead.toString())
    }
}
