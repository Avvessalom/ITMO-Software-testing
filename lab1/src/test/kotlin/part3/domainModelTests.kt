package part3

import org.junit.jupiter.api.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class domainModelTests {
    private val testHuman = Human("test1", 10)
    private val trilian = Human("Триллиан", 10)
    private val testRobot = Robot("kek")
    private val testPlase = Place("угол")
    private val testLeg = LegOfRobot("test")
    private val testHead = HeadOfRobot("test")

    @Test
    fun `human is alien`() {
        assertTrue { testHuman.seem(testHuman.isAlienWatcher) }
    }

    @Test
    fun `trillian is alien`() {
        assertTrue { trilian.seem(trilian.isAlienWatcher) }
    }

    @Test
    fun `test stop robot`() {
        assertEquals("Остановился перед ${trilian.toString()}.", testRobot.stop(trilian))
    }

    @Test
    fun `test robot sit`() {
        assertEquals("сидит в ${testPlase.toString()}. ", testRobot.sit(testPlase))
    }

    @Test
    fun `test robot getup`() {
        assertEquals("жоска поднялся из ${testPlase.toString()} на ${testLeg.toString()}.",
            testRobot.getUp(testPlase, "жоска", testLeg))
    }

    @Test
    fun `test try to go`() {
        assertEquals(" героическая попытка пересечь ${testPlase.toString()}.", testRobot.tryToGo(testPlase))
    }

    @Test
    fun `test watch`() {
        assertEquals("Смотреть сквозь левое плечо ${testHuman.toString()}", testRobot.watch(testHuman))
    }

    @Test
    fun `test robot name`() {
        assertEquals("Робот ", testRobot.toString())
    }

    @Test
    fun `test robot head action`() {
        assertEquals("Голова робота резко дернулась вверх. ", testHead.action("резко", "дернулась вверх"))
    }
}