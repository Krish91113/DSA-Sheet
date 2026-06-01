package LinkedList.SingleLinkedList;

import java.util.*;

//class Node {
//    int data;
//    Node next;
//
//    Node(int val) {
//        data = val;
//        next = null;
//    }
//}

public class reverseLL {

    // Corrected Reverse Function
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;      // Store next node
            curr.next = prev;      // Reverse the link
            prev = curr;           // Move prev forward
            curr = next;           // Move curr forward
        }

        return prev;   // New head (previously last node)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
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

        System.out.print("Original List : ");
        printList(head);

        // Reverse the list
        head = reverse(head);   // Important: Update head with new head

        System.out.print("Reversed List: ");
        printList(head);
    }

    // Helper method to print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}