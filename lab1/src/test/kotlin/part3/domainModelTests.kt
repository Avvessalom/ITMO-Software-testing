package part3

import org.junit.jupiter.api.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DomainModelTests {
    lateinit var testHuman: Human
    lateinit var testRobot: Robot
    lateinit var trilian: Human
    lateinit var testPlase: Place
    lateinit var testLeg: LegOfRobot
    lateinit var testHead: HeadOfRobot

    @BeforeEach
    fun init(){
        testHuman = Human("testHuman", 10)
        testRobot = Robot("testRobot")
        trilian = Human("Триллиан", 10)
        testPlase = Place("угол")
        testLeg = LegOfRobot("test")
        testHead = HeadOfRobot("test")
    }

    @Test
    @DisplayName("Human is alien")
    fun `human is alien`() {
        assertTrue { testHuman.seem(testHuman.isAlienWatcher) }
    }

    @Test
    @DisplayName("Trillian is alien")
    fun `trillian is alien`() {
        assertTrue { trilian.seem(trilian.isAlienWatcher) }
    }

    @Test
    @DisplayName("stop robot")
    fun `test stop robot`() {
        assertEquals("Остановился перед ${trilian.toString()}.", testRobot.stop(trilian))
    }

    @Test
    @DisplayName("robot sit")
    fun `test robot sit`() {
        assertEquals("сидит в ${testPlase.toString()}. ", testRobot.sit(testPlase))
    }

    @Test
    @DisplayName("robot getup")
    fun `test robot getup`() {
        assertEquals("жоска поднялся из ${testPlase.toString()} на ${testLeg.toString()}.",
            testRobot.getUp(testPlase, "жоска", testLeg))
    }

    @Test
    @DisplayName("robot try to go")
    fun `test try to go`() {
        assertEquals(" героическая попытка пересечь ${testPlase.toString()}.", testRobot.tryToGo(testPlase))
    }

    @Test
    @DisplayName("robot watch")
    fun `test watch`() {
        assertEquals("Смотреть сквозь левое плечо ${testHuman.toString()}", testRobot.watch(testHuman))
    }

    @Test
    @DisplayName("robot name")
    fun `test robot name`() {
        assertEquals("Робот ", testRobot.toString())
    }

    @Test
    @DisplayName("robot head action")
    fun `test robot head action`() {
        assertEquals("Голова робота резко дернулась вверх. ", testHead.action("резко", "дернулась вверх"))
    }
}
