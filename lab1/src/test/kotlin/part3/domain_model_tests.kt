package part3

import org.junit.jupiter.api.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class domain_model_tests {
    private val testHuman = Human("test1", 10)
    private val testHuman1 = Human("Триллиан", 10)
    private val testRobot = Robot("kek")
    @Test
    fun `human is alien`(){
        assertTrue {testHuman.seem(testHuman.isAlienWatcher)}
    }

    @Test
    fun `trillian is alien`(){
        assertTrue {testHuman1.seem(testHuman1.isAlienWatcher)}
    }

    @Test
    fun `test stop robot`(){
        assertEquals("Остановился перед Триллиан.", testRobot.stop(testHuman1))
    }
}