// Node class definition
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class definition
class LinkedList {
    Node head;

    // Function to add a new node at the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Function to reorder the linked list in zigzag fashion
    public void zigzag() {
        if (head == null || head.next == null) return;

        Node current = head;
        boolean flag = true; // True indicates "<" relation, False indicates ">" relation

        while (current.next != null) {
            if (flag) {
                // If current data is greater than the next, swap them
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            } else {
                // If current data is less than the next, swap them
                if (current.data < current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }
            // Toggle the flag for the next comparison
            flag = !flag;
            current = current.next;
        }
    }

    // Function to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class to test the zigzag function
public class ZigzagLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(1);

        System.out.println("Original List:");
        list.printList();

        list.zigzag();

        System.out.println("Zigzag List:");
        list.printList();
    }
}
