import java.util.LinkedList;

public class LLincollectionframework2 {
    public static void main(String[] args) {
        //yha integer wale jagah hume classes use karni h premitive datatype use ni karna h int float  boolean we have to not use
        LinkedList<Integer>ll=new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);


    }

    
}
