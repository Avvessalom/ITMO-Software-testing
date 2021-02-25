import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

import kotlin.math.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FunctionsTests {


    @Test fun `mySin(x) algorithm test` () = assertAll(
        { assertEquals(0.09983341664682815, mySin(0.1), 0.001) },
        { assertEquals(0.8414709848079 , mySin(1), 0.001)},
    )

    @Test fun `mySin(x) boundary points test` () = assertAll(
        { assertEquals(0.0 , mySin(0), 0.001) },
        { assertEquals(1.0, mySin(PI / 2), 0.001) },
        { assertEquals(0.0, mySin(PI), 0.01) },
        { assertEquals(-1.0, mySin(-1.5707963267948966), 0.001)}
    )

    @Test fun `mySin(x) first quarter test` () = assertAll(
        { assertEquals(0.5, mySin(PI / 6), 0.001) },
        { assertEquals(sqrt(2.0) / 2, mySin(PI / 4), 0.001) },
        { assertEquals(sqrt(3.0) / 2, mySin(PI / 3), 0.001) },
        )

    @Test fun `mySin(x) second quarter test` () = assertAll(
        { assertEquals(sqrt(3.0) / 2, mySin(2 * PI / 3), 0.001) },
        { assertEquals(sqrt(2.0) / 2, mySin(3 * PI / 4), 0.001) },
        { assertEquals(0.5, mySin(5 * PI / 6), 0.001)}
    )

    @Test fun `mySin(x) third quarter test` () = assertAll(
        { assertEquals(-0.5, mySin(7 * PI / 6), 0.01) },
        { assertEquals(-1 * sqrt(2.0) / 2, mySin(5 * PI / 4), 0.1)},
        { assertEquals(-sqrt(3.0) / 2, mySin(4 * PI / 3), 0.1)}
    )

    @Test fun `mySin(x) forth quarter test` () = assertAll(
        { assertEquals(-1 * sqrt(3.0) / 2, mySin(-1.04719), 0.001)},
        { assertEquals(-sqrt(2.0) / 2, mySin(-0.7853981633974486), 0.001)},
        { assertEquals(-0.5, mySin(-0.523599), 0.001)}
    )
}
