package DSA.LinkedList.java;

public class CircularLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = head;
        Node trav = head;
        do {
            System.out.print(trav.data + " ");
            trav = trav.next;
        } while (trav != head);
        System.out.println();
    }
}
