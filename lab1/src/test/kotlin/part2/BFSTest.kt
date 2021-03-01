package part2

import org.junit.jupiter.api.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BFSTest {
    val smallGraph = ArrayList<IntArray>()
    val largeGraph = ArrayList<IntArray>()

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

    @BeforeAll
    fun initLargeGraph() {
        largeGraph.add(intArrayOf(2, 7))
        largeGraph.add(intArrayOf(0, 2, 4, 5))
        largeGraph.add(intArrayOf(1))
        largeGraph.add(intArrayOf(6, 17))
        largeGraph.add(intArrayOf(5))
        largeGraph.add(intArrayOf(1, 9))
        largeGraph.add(intArrayOf(3, 5))
        largeGraph.add(intArrayOf())
        largeGraph.add(intArrayOf(4, 7, 10, 12))
        largeGraph.add(intArrayOf(10))
        largeGraph.add(intArrayOf(9, 13, 17))
        largeGraph.add(intArrayOf(8, 14, 15))
        largeGraph.add(intArrayOf(8, 9, 13, 15))
        largeGraph.add(intArrayOf(12))
        largeGraph.add(intArrayOf(11, 15))
        largeGraph.add(intArrayOf(16, 17))
        largeGraph.add(intArrayOf(17))
        largeGraph.add(intArrayOf(13))
    }
}