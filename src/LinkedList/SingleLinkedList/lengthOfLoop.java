package LinkedList.SingleLinkedList;
class ListNode {
    int data;
    ListNode next;

    ListNode(int val) {
        data = val;
        next = null;
    }
}
public class lengthOfLoop {
    public int findLengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
            if(fast == slow) break;
        }
        if(fast == null || fast.next == null) return 0;
        while(head!=slow){
            slow=slow.next;
            head= head.next;
        }
        int len =1;
        slow = slow.next;
        while(slow != head){
            slow= slow.next;
            len++;
        }
        return len;
    }
}
