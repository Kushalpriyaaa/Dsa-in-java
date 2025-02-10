class AddMidle {
    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {
        Node newW = new Node(data);
        newW.next = head;
        head = newW;
        if (tail == null) {
            tail = newW;
        }
    }

    public void addlast(int data) {
        Node newW = new Node(data);
        if (head == null) {
            head = tail = newW;
            return;
        }
        tail.next = newW;
        tail = newW;
    }

    public void addmidle(int index, int data) {
        if (index == 0) {
            addfirst(data);
            return;
        }
        Node newW = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        AddMidle list = new AddMidle();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        list.print();
        list.addlast(5);
        list.print();
        list.addmidle(2, 6);
        list.print();
    }
}