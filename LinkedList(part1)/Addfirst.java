public class Addfirst {
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
        Addfirst list = new Addfirst();
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);
        list.addfirst(40);
        list.addfirst(50);
        list.print();
        
        
        
    }

}