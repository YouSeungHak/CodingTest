package _0001_0100

class Kt0083RemoveDuplicatesFromSortedList {
    fun deleteDuplicates(head: Kt0083ListNode?): Kt0083ListNode? {
        if (head?.next == null) return head

        var curNode: Kt0083ListNode = head
        var nextNode: Kt0083ListNode? = head.next

        while (true) {
            if (nextNode == null) break
            if (curNode.`val` == nextNode.`val`) curNode.next = nextNode.next else curNode = nextNode
            nextNode = nextNode.next
        }

        return head
    }
}