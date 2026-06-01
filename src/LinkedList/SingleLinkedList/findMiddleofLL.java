package LinkedList.SingleLinkedList;
import java.util.*;
//public class Node{
//    int data;
//    Node next;
//    Node(int val){
//        data =val;
//        next =null;
//    }
//}
public class findMiddleofLL {
    public static Node findMiddle(Node head){
//        Node temp =head;
//        int size =0;
//        while(temp!= null){
//            size++;
//            temp=temp.next;
//        }
//        int n = size/2;
//        temp=head;
//        size=0;
//        while(temp!=null){
//            if(size == n) return temp;
//            temp=temp.next;
//            size++;
//        }
//        return temp;

        Node fast =head;
        Node slow=head;
        if(head == null || head.next == null) return head;
        while(fast!=null && fast.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
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
//        }
//        Node temp =head;
//        int size =0;
//        while(temp!= null){
//            size++;
//            System.out.print(temp.data + " -> ");
//            temp=temp.next;
//        }
//        System.out.println("Size of Linkedlist is " + size);
        }
        System.out.println(findMiddle(head));
    }
}
