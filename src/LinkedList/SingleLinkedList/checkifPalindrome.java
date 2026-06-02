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
public class checkifPalindrome {
    public static boolean palindrome(int n){
        int temp =n,ld=0;
        while(temp > 0){
            int rem =temp % 10;
            ld = rem + (ld*10);
            temp/=10;
        }
        while(n>0 && ld > 0){
            int rem1 =n%10;
            int rem2 = ld % 10;
            if(rem1 != rem2) return false;
            n/=10;
            ld/=10;
        }
        return true;
    }
    public static boolean checkPalindrome(Node head){
        int n=0,sum=0,c=1;
        Node temp=head;
        while(temp!= null){
            n=temp.data;
            sum+=n + (sum * c);
            c*=10;
            temp=temp.next;
        }
        return palindrome(sum);
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
        System.out.println(checkPalindrome(head));
    }
}
