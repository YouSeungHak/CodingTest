package _0201_0300

import java.util.*

class Kt0225ImplementStackUsingQueues {
    private var posCurQueue = 0
    private var queue1: Queue<Int> = LinkedList()
    private var queue2: Queue<Int> = LinkedList()

    private fun changeQueue() {
        posCurQueue = if (posCurQueue == 0) 1 else 0
    }

    private fun curQueue(): Queue<Int> {
        return if (posCurQueue == 0) queue1 else queue2
    }

    private fun backupQueue(): Queue<Int> {
        return if (posCurQueue == 0) queue2 else queue1
    }

    fun push(x: Int) {
        curQueue().add(x)
    }

    fun pop(): Int {
        if (curQueue().size == 0) return 0
        while (curQueue().size > 1) {
            backupQueue().add(curQueue().poll())
        }
        val retData = curQueue().poll()
        changeQueue()
        return retData
    }

    fun top(): Int {
        if (curQueue().size == 0) return 0
        while (curQueue().size > 1) {
            backupQueue().add(curQueue().poll())
        }
        val retData = curQueue().poll()
        backupQueue().add(retData)
        changeQueue()
        return retData
    }

    fun empty(): Boolean {
        return curQueue().size == 0
    }
}