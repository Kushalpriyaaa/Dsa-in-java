import java.util.*; 
public class A2 {
    public static int LinearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){

            if(arr[i]==key){
                return i;
            }


        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        int key=10;
        System.out.println("key is at index: "+LinearSearch(arr, key));
        
        
    }
    
}