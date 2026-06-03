//package LinkedList.SingleLinkedList;
//import java.util.*;
//class Node {
//    int data;
//    Node next;
//
//    Node(int val) {
//        data = val;
//        next = null;
//    }
//}
//public class segregateOddAndEvenNodes {
//    public static void evenAndOdd(Node head){
//        Node odd =new Node(-1);
//        Node even=new Node(-1);
//        Node temp=head;
//        Node t1=odd;
//        Node t2=even;
//        while(temp!=null){
//            int c =temp.data;
//            if(c % 2 != 0){
//                t1.next=temp;
//                t1=t1.next;
//            }else{
//                t2.next=temp;
//                t2=t2.next;
//            }
//            temp=temp.next;
//        }
//        t2.next=null;
//        odd=odd.next;
//        t1.next=even.next;
//        Node z=odd;
//        while(z!=null){
//            System.out.print(z.data + "->");
//            z=z.next;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Node head = null;
//        Node tail = null;
//        System.out.println("Enter Number of Elements");
//        int n = sc.nextInt();
//        System.out.println("Enter elements");
//        for (int i = 0; i < n; i++) {
//            int val = sc.nextInt();
//            Node newNode = new Node(val);
//            if (head == null) {
//                head = newNode;
//                tail = newNode;
//            } else {
//                tail.next = newNode;
//                tail = newNode;
//            }
//        }
//        evenAndOdd(head);
//    }
//}
