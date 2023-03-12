package _0001_0100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0083_RemoveDuplicatesFromSortedListTest {

    boolean checkListNode1() {
        _0083_RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new _0083_RemoveDuplicatesFromSortedList();

        _0083_ListNode listNode = new _0083_ListNode(1);
        _0083_ListNode listNode2 = new _0083_ListNode(1);
        _0083_ListNode listNode3 = new _0083_ListNode(2);

        _0083_ListNode retListNode;

        listNode.next = listNode2;
        listNode2.next = listNode3;

        retListNode = removeDuplicatesFromSortedList.deleteDuplicates(listNode);
        if(retListNode.val == 1 && retListNode.next.val == 2 && retListNode.next.next == null)
            return true;

        return false;
    }

    @Test
    void case1() {
        assertTrue(checkListNode1());
    }
}