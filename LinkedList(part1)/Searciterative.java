public class Searciterative {
    public static class Node {
        int data;
        Node next;
        //constructor
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head ;
    public static Node tail ;
    public static int size ;

    public void addfirst(int data){
        //step1 : create a new node
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        //staep2:newnode next =head
        newnode.next=head;
        //step3:head =newnode
        head=newnode;
    }
    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void search(int data){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==data){
                System.out.println("Element found at index "+i);
                return;
            }
            temp=temp.next;
            i++;
        }
        System.out.println("Element not found");
    }
    public void print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->"); 
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Searciterative list = new Searciterative();
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);
        list.addfirst(40);
        list.addfirst(50);
        list.addlast(60);
        list.addlast(70);
        list.addlast(80);
        list.addlast(90);
        list.addlast(100);
        list.print();
        list.search(60);
        list.search(1000);
    }
    
}
