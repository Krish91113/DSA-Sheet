package LinkedList.SingleLinkedList;
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
public class findLoopIn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;
        System.out.println("Enter Number of Elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.println(loop(head));
    }
    public static boolean loop(Node head){
        if(head == null || head.next == null) return false;
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            if(fast == slow) return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}
