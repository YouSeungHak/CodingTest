package _1900_2000

import java.util.*

class Kt1971Node(var nodeNum: Int) {
    var nodeList = ArrayList<Kt1971Node>()
    var visited = false
    fun connectNode(node: Kt1971Node) {
        nodeList.add(node)
        node.nodeList.add(this)
    }
}

class Kt1971FindIfPathExistsInGraph {
    private fun isPathSourceToDestinationInBFS(graph: Map<Int, Kt1971Node>, source: Int, destination: Int): Boolean {
        val queue: Queue<Kt1971Node?> = LinkedList()
        graph[source]!!.visited = true
        queue.add(graph[source])
        while (queue.size > 0) {
            val curNode = queue.poll()
            for (i in curNode!!.nodeList.indices) {
                if (!curNode.nodeList[i].visited) {
                    if (curNode.nodeList[i].nodeNum == destination) return true
                    curNode.nodeList[i].visited = true
                    queue.add(curNode.nodeList[i])
                }
            }
        }
        return false
    }

    private fun createGraph(n: Int, edges: Array<IntArray>): Map<Int, Kt1971Node> {
        val graph: MutableMap<Int, Kt1971Node> = HashMap()
        for (i in 0 until n) {
            graph[i] = Kt1971Node(i)
        }
        for (edge in edges) {
            graph[edge[1]]?.let { graph[edge[0]]!!.connectNode(it) }
        }
        return graph
    }
    
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
        if (source == destination) return true

        val graph: Map<Int, Kt1971Node> = createGraph(n, edges)
        return isPathSourceToDestinationInBFS(graph, source, destination)
    }
}