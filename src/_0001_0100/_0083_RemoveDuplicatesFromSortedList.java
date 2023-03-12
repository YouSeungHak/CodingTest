package _0001_0100;

public class _0083_RemoveDuplicatesFromSortedList {
    // Definition for singly-linked list.
    public _0083_ListNode deleteDuplicates(_0083_ListNode head) {
        if(head == null || head.next == null)
            return head;

        _0083_ListNode curNode = head;
        _0083_ListNode nextNode = head.next;

        while(true)
        {
            if(nextNode == null)
                break;

            if(curNode.val == nextNode.val)
                curNode.next = nextNode.next;
            else
                curNode = nextNode;

            nextNode = nextNode.next;
        }


        return head;
    }
}
