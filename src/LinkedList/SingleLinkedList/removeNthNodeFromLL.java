package LinkedList.SingleLinkedList;

import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class removeNthNodeFromLL {
    public static void removeNthNode(Node head, int n){
        Node temp =head;
        int len=0;
        while(temp!= null){
            temp=temp.next;
            len++;
        }
        temp=head;
        Node prev=null;
        for(int i=0;i<len-n;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        Node temp2=head;
        while(temp2!= null){
            System.out.print(temp2.data + "->");
            temp2=temp2.next;

        }
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
        }
        int k=sc.nextInt();
        removeNthNode(head,k);
    }
}
