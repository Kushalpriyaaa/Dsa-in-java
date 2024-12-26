public class DETECT1{
    
        public static class Node {
            int data;
            Node next; 
            public Node(int data){
                this.data=data;
                this.next=null;
            }  
        }
        public static Node head;
        public static Node tail;
        //for size of linked list
        public static int size;
        public void addFirst(int data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
    
            }
            
            
            newNode.next=head;
            head=newNode;
        }
        public void addLast(int data){
            size++;
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
    
            }
            tail.next=newNode;
            tail=newNode;
    
    
    
        }
        public void print(){
            if(head==null){
               System.out.println("LL is empty");
                return;
    
            }
            Node temp=head;
            while(temp !=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        //to add node in midle
        public void add(int idx,int data){
            //in special case to add in first in head
            if(idx==0){
                addFirst(data);
                return;
            }
            Node newNode=new Node(data);
            size++;
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
    
            }
            //i=idx-1;temp->prev
            newNode.next=temp.next;
            temp.next=newNode;
    
        }
        //Remove cycle
        public static void removeCycle() {
            //Detect cycle
            Node slow=head;
            Node fast=head;
            boolean cycle= false;
            while(fast !=null && fast.next !=null){
                slow =slow.next;
                fast=fast.next.next;
                if(fast==slow){
                    cycle=true;
                    break;
                }

            }
            
            if(cycle==false){
                return;
            }
            //Find meeting point
            slow=head;
            Node prev = null;
            while(slow!=fast){
                prev =fast;
                slow=slow.next;
                fast=fast.next;
            }

            //remove cycle ->last.next=null
            prev.next=null;
            
        }
        public static boolean inCycle(){
                    Node slow = head;
                    Node fast=head;
                   while(fast!=null && fast.next !=null){
                    slow= slow.next;
                    fast=fast.next.next;
                    if(slow==fast){
                        return true;//cycle exists
                    }
        
                   }
                   return false;
                }
               
                
        public static void main(String[] args) {
            head = new Node(1);
            Node temp = new Node(2);
            head.next=temp;
            head.next.next=new Node(3);
            head.next.next.next= temp;
            //head.next.next.next= head;
            
            System.out.println(inCycle());
            removeCycle();
            System.out.println(inCycle());

            
        }
    }

