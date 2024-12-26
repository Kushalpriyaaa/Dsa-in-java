import java.util.*;

public class MergeSortLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node getMid(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case for empty or single-node lists
        }

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Slow points to the middle node in even-length lists
    }

    private Node merge(Node left, Node right) {
        Node dummy = new Node(0); // Dummy node for easier list construction
        Node tail = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        // Append remaining nodes from the non-empty list
        tail.next = (left != null) ? left : right;

        return dummy.next; // Return the actual merged list (skip dummy)
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: empty or single-node list
        }

        Node mid = getMid(head);
        Node leftHalf = head;
        Node rightHalf = mid.next;
        mid.next = null; // Separate the halves

        leftHalf = mergeSort(leftHalf); // Recursively sort left half
        rightHalf = mergeSort(rightHalf); // Recursively sort right half

        return merge(leftHalf, rightHalf); // Merge the sorted halves
    }

    public static void main(String[] args) {
        MergeSortLinkedList list = new MergeSortLinkedList();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.print("Original list: ");
        printList(head);

        head = list.mergeSort(head);

        System.out.print("Sorted list: ");
        printList(head);
    }

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
