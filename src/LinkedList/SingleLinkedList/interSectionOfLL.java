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
public class interSectionOfLL {
    public static Node intersection(Node head1, Node head2){
        Node temp1 =head1;
        Node temp2=head2;
        int len1=0,len2=0;
        while(temp1!=null) {
            temp1 = temp1.next;
            len1++;
        }
        while(temp2!=null) {
            temp2 = temp2.next;
            len2++;
        }
        temp1=head1;
        temp2=head2;
        if(len1 > len2){
            for(int i=0;i<len1-len2;i++) temp1=temp1.next;
        }else{
            for(int i=0;i<len2-len1;i++) temp2=temp2.next;
        }
        while(temp1!= temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
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
    }
}
