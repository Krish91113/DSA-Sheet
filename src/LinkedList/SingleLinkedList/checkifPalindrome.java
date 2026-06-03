//package LinkedList.SingleLinkedList;
////import java.util.*;
////class Node {
////    int data;
////    Node next;
////
////    Node(int val) {
////        data = val;
////        next = null;
////    }
////}
//public class checkifPalindrome {
//    public static Node findMid(Node head){
//        Node slow =head;
//        Node fast=head;
//        while(fast!=null && fast.next!= null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        return slow;
//    }
//    public static boolean checkPalindrome(Node head){
//        if(head == null || head.next == null) return true;
//        Node mid =findMid(head);
//        Node prev =null;
//        Node curr=mid;
//        while(curr!= null){
//            Node next =curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//        }
//        curr=head;
//        while(prev!= null){
//            if(prev.data != curr.data) return false;
//            prev=prev.next;
//            curr=curr.next;
//        }
//        return true;
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
//        System.out.println(checkPalindrome(head));
//    }
//}
