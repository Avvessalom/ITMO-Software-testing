package part2

import org.junit.jupiter.api.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BFSTest {
    val smallGraph = ArrayList<IntArray>()
    val largeGraph = ArrayList<IntArray>()

    private fun createStringPath(path: ArrayList<IntArray>):ArrayList<String> {
        val list = ArrayList<String>()
        for (node in path) {
            val strPath = node[0].toString() + node[1].toString()
            list.add(strPath)
        }
        return list
    }

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
    fun `test small graph with path 0--6`() {
        Assertions.assertTrue(isReachable(0, 6, smallGraph))
    }

    @Test
    fun `test small graph without path 0--7`() {
        Assertions.assertFalse(isReachable(0, 7, smallGraph))
    }

    @Test
    fun `test small graph with path 0--0`() {
        Assertions.assertTrue(isReachable(0, 0, smallGraph))
    }

    @Test
    fun `test small graph breadcrumbs with path 0--6` () {
        val expectedPath = ArrayList<IntArray>()
        expectedPath.add(intArrayOf(0, 1))
        expectedPath.add(intArrayOf(0, 2))
        expectedPath.add(intArrayOf(0, 3))
        expectedPath.add(intArrayOf(1, 5))
        expectedPath.add(intArrayOf(1, 6))

        val path = search(0, 6, smallGraph)
        val stringPath = createStringPath(path)
        for (node in expectedPath) {
            Assertions.assertTrue(stringPath.contains(node[0].toString() + node[1].toString()))
        }
    }

    @Test
    fun `test small graph breadcrumbs without path 0--7` () {
        val expectedPath = ArrayList<IntArray>()
        expectedPath.add(intArrayOf(0, 1))
        expectedPath.add(intArrayOf(0, 2))
        expectedPath.add(intArrayOf(0, 3))
        expectedPath.add(intArrayOf(1, 5))
        expectedPath.add(intArrayOf(1, 6))

        val path = search(0, 7, smallGraph)
        val stringPath = createStringPath(path)
        for (node in expectedPath) {
            Assertions.assertTrue(stringPath.contains(node[0].toString() + node[1].toString()))
        }
    }

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

    @Test
    fun `test large graph with path 0-17` () {
        Assertions.assertTrue(isReachable(0, 17, largeGraph))
    }

    @Test
    fun `test large graph without path 11-3` () {
        Assertions.assertFalse(isReachable(11, 3, largeGraph))
    }

    @Test
    fun `test large graph with path 7-7` () {
        Assertions.assertTrue(isReachable(7, 7, largeGraph))
    }

    @Test
    fun `test large graph breadcrumbs with path 0--17` () {
        val expectedPath = ArrayList<IntArray>()
        expectedPath.add(intArrayOf(0, 2))
        expectedPath.add(intArrayOf(0, 7))
        expectedPath.add(intArrayOf(2, 1))
        expectedPath.add(intArrayOf(1, 4))
        expectedPath.add(intArrayOf(1, 5))
        expectedPath.add(intArrayOf(5, 9))
        expectedPath.add(intArrayOf(9, 10))
        expectedPath.add(intArrayOf(10, 13))
        expectedPath.add(intArrayOf(10, 17))

        val path = search(0, 17, largeGraph)
        val stringPath = createStringPath(path)
        for (node in expectedPath) {
            Assertions.assertTrue(stringPath.contains(node[0].toString() + node[1].toString()))
        }
    }

    @Test
    fun `test large graph breadcrumbs without path 11--3` () {
        val expectedPath = ArrayList<IntArray>()
        expectedPath.add(intArrayOf(11, 8))
        expectedPath.add(intArrayOf(11, 14))
        expectedPath.add(intArrayOf(11, 15))
        expectedPath.add(intArrayOf(8, 4))
        expectedPath.add(intArrayOf(8, 7))
        expectedPath.add(intArrayOf(8, 10))
        expectedPath.add(intArrayOf(8, 12))
        expectedPath.add(intArrayOf(15, 16))
        expectedPath.add(intArrayOf(15, 17))
        expectedPath.add(intArrayOf(4, 5))
        expectedPath.add(intArrayOf(10, 9))
        expectedPath.add(intArrayOf(10, 13))
        expectedPath.add(intArrayOf(5, 1))
        expectedPath.add(intArrayOf(1, 0))
        expectedPath.add(intArrayOf(1, 2))

        val path = search(11, 3, largeGraph)
        val stringPath = createStringPath(path)
        for (node in expectedPath) {
            Assertions.assertTrue(stringPath.contains(node[0].toString() + node[1].toString()))
        }
    }

    @Test
    fun `test large graph breadcrumbs with path 7--7` () {
        val expectedPath = ArrayList<IntArray>()
        expectedPath.add(intArrayOf(7, 7))

        val path = search(7, 7, largeGraph)
        val stringPath = createStringPath(path)
        for (node in expectedPath) {
            Assertions.assertTrue(stringPath.contains(node[0].toString() + node[1].toString()))
        }
    }
}