package part2

import java.util.*
import kotlin.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

fun search(start: Int, finish: Int, graphMatrix: ArrayList<IntArray>): ArrayList<IntArray> {
    val visited = HashSet<Int>()
    val searchQueue = ArrayDeque<Int>()

    visited.add(start)
    searchQueue.addLast(start)

    val marked = ArrayList<Int>()
    val graph = ArrayList<IntArray>()
    var currentNode: Int
    while (searchQueue.size > 0) {
        currentNode = searchQueue.pop()
        visited.add(currentNode)
        if (currentNode == finish) {
            graph.add(intArrayOf(currentNode, currentNode))
            return graph
        }

        for (i in graphMatrix[currentNode]) {
            if (!visited.contains(i)) {
                if (!marked.contains(i)) {
                    marked.add(i)
                    graph.add(intArrayOf(currentNode, i))
                }
                if (i == finish) {
                    return graph
                }
                searchQueue.addLast(i)
            }
        }
    }

    return graph
}

fun isReachable(start: Int, finish: Int, graphMatrix: ArrayList<IntArray>): Boolean {
    val graph = search(start, finish, graphMatrix)
    for (i in graph) {
        if (i[2] == finish) {
            return true
        }
    }
    return false
}

fun main() {
    val array = ArrayList<IntArray>()
    array.add(intArrayOf(1, 2, 3))
    array.add(intArrayOf(2, 5, 6))
    array.add(intArrayOf(1, 5, 6))
    array.add(intArrayOf())
    array.add(intArrayOf(2))
    array.add(intArrayOf())
    array.add(intArrayOf())
    array.add(intArrayOf(5, 6))

    val start = 0
    val finish = 7
    val graph = search(start, finish, array)
    var found = false
    for (i in graph) {
        print(i[0])
        print("->")
        print(i[1])
        if (i[1] == finish) {
            found = true
        }
        println()
    }
    if (found) {
        println("Path found!")
    }
    else {
        println("Path wasn't found!")
    }
}