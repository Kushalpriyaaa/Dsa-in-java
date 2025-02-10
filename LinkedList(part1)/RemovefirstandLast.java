public class RemovefirstandLast {
    public static class Node {
        int data;
        Node Next;

        public Node(int data) {
            this.data = data;
            this.Next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Constructor to initialize the list
    public RemovefirstandLast() {
        head = null;
        tail = null;
        size = 0;
    }

    // Method to add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.Next = head;
            head = newNode;
        }
        size++;
    }

    // Method to remove the first node
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) { // Only one node present
            head = tail = null;
        } else {
            head = head.Next;
        }
        size--;
    }
    public void removeLast(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) { // Only one node present
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.Next != tail) {
                temp = temp.Next;
            }
            tail = temp;
            tail.Next = null;
        }
    }

    // Method to print the linked list
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.Next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemovefirstandLast list = new RemovefirstandLast();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        
        list.print(); // Expected Output: 30 --> 20 --> 10 --> null

        list.removeFirst();
        list.print(); // Expected Output: 20 --> 10 --> null
        list.removeLast();
        list.print(); // Expected Output: 20 --> null
    }
}
