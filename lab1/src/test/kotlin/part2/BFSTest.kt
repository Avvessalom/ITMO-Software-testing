package part2

import org.junit.jupiter.api.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BFSTest {
    val smallGraph = ArrayList<IntArray>()

    @BeforeAll
    fun initSmallGraph() {
        smallGraph.add(intArrayOf(1, 2, 3))
        smallGraph.add(intArrayOf(2, 5, 6))
        smallGraph.add(intArrayOf(1, 5, 6))
        smallGraph.add(intArrayOf())
        smallGraph.add(intArrayOf(2))
        smallGraph.add(intArrayOf())
        smallGraph.add(intArrayOf())
        smallGraph.add(intArrayOf(5, 6))
    }

    @Test
    fun `test graph1 with path 0--6`() {
        Assertions.assertTrue(isReachable(0, 6, smallGraph))
    }

    @Test
    fun `test graph1 without path 0--7`() {
        Assertions.assertFalse(isReachable(0, 7, smallGraph))
    }

    @Test
    fun `test graph1 with path 0--0`() {
        Assertions.assertTrue(isReachable(0, 0, smallGraph))
    }
}