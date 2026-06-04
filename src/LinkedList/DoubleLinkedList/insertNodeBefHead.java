package LinkedList.DoubleLinkedList;
import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class insertNodeBefHead {
    public static Node insertNodeBeforeHead(Node head, int x){
        Node newNode=new Node(x);
        if(head == null) return newNode;
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return head;
    }
    public static Node createDLL(int n, Scanner sc) {
        if (n == 0) return null;

        Node head = new Node(sc.nextInt());
        Node tail = head;

        for (int i = 1; i < n; i++) {
            Node newNode = new Node(sc.nextInt());

            tail.next = newNode;
            newNode.prev = tail;

            tail = newNode;
        }

        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x= sc.nextInt();
        Node head = createDLL(n, sc);
        Node t=insertNodeBeforeHead(head,x);
        while(t!=null){
            System.out.print(t.data+"<->");
            t=t.next;
        }
        System.out.print("null");
    }
}