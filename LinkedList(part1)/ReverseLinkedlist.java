public class ReverseLinkedlist {
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
    public void addmidle(int index,int data){
        if(index==0){
            addfirst(data);
            return;
        }
        Node newnode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public void reverse(){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
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
        ReverseLinkedlist list = new ReverseLinkedlist();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        list.addfirst(5);
        list.addfirst(6);
        list.addfirst(7);
        list.addfirst(8);
        list.addfirst(9);
        list.addfirst(10);
        list.print();
        list.addmidle(5, 11);
        list.print();
        list.reverse();
        list.print();
    }
    
}
