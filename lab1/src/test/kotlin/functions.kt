import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

import kotlin.math.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FunctionsTests {


    @Test fun `mySin(x) algorithm test` () = assertAll(
        { assertEquals(0.09983341664682815, mySin(0.1), 0.001) },
        { assertEquals(0.8414709848079 , mySin(1), 0.001)},

        { assertEquals(1.0, mySin(PI / 2), 0.001) },
        { assertEquals(0.0 , mySin(0), 0.001) },

        )
    @Test fun `mySin(x) first quarter` () = assertAll(
        { assertEquals(0.5, mySin(PI / 6), 0.001) },
        { assertEquals(sqrt(2.0) / 2, mySin(PI / 4), 0.001) },
        { assertEquals(sqrt(3.0) / 2, mySin(PI / 3), 0.001) },
        )

    @Test fun `mySin(x) second quarter` () = assertAll(
        { assertEquals(sqrt(3.0) / 2, mySin(2 * PI / 3), 0.001) },
        { assertEquals(sqrt(2.0) / 2, mySin(3 * PI / 4), 0.001) },
        { assertEquals(0.5, mySin(5 * PI / 6), 0.001)}
    )

    @Test fun `mySin(x) third quarter` () = assertAll(

    )
}
