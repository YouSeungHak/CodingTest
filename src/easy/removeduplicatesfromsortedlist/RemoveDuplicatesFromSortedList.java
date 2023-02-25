package easy.removeduplicatesfromsortedlist;

public class RemoveDuplicatesFromSortedList {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode curNode = head;
        ListNode nextNode = head.next;

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
	
	public static void main(String[] args) {

	}
}
