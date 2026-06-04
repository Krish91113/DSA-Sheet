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
//public class AddTwoNumberInLL {
//    public static void addNumber(Node head1, Node head2){
//        Node dummy =new Node(-1);
//        Node temp =dummy;
//        int c=0;
//        while(head1!= null && head2!= null){
//            int sum=0;
//            if(head1!=null ){
//                sum+=head1.data;
//                head1=head1.next;
//            }
//            if(head2!=null ){
//                sum+=head2.data;
//                head2=head2.next;
//            }
//            sum+=c;
//            c=sum/10;
//            Node newNode =new Node(sum%10);
//            temp.next=newNode;
//            temp=temp.next;
//        }
//        dummy=dummy.next;
//        temp=dummy;
//        while(temp!=null){
//            System.out.print(temp.data + "->");
//            temp=temp.next;
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
//
//        Node head1 = null;
//        Node tail1 = null;
//        System.out.println("Enter Number of Elements");
//        int n1 = sc.nextInt();
//        System.out.println("Enter elements");
//        for (int i = 0; i < n1; i++) {
//            int val = sc.nextInt();
//            Node newNode = new Node(val);
//            if (head1 == null) {
//                head1 = newNode;
//                tail1 = newNode;
//            } else {
//                tail1.next = newNode;
//                tail1 = newNode;
//            }
//        }
//        addNumber(head,head1);
//    }
//}
