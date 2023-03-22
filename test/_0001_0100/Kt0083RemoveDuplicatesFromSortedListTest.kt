package _0001_0100

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Kt0083RemoveDuplicatesFromSortedListTest {

    private fun checkListNode1(): Boolean {
        val removeDuplicatesFromSortedList = Kt0083RemoveDuplicatesFromSortedList()
        val listNode = Kt0083ListNode(1)
        val listNode2 = Kt0083ListNode(1)
        val listNode3 = Kt0083ListNode(2)
        listNode.next = listNode2
        listNode2.next = listNode3
        val retListNode: Kt0083ListNode = removeDuplicatesFromSortedList.deleteDuplicates(listNode)!!
        return retListNode.`val` == 1 && retListNode.next?.`val` == 2 && retListNode.next?.next == null
    }

    @Test
    fun case1() {
        assertTrue(checkListNode1())
    }
}