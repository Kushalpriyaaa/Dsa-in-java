import java.util.*;


public class A5 {
    public static int binarysearch(int arr[],int key){
        int start=0; int end=arr.length-1;
       while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==key){
            
            return mid;

        }
        if(arr[mid]<key){
            start=mid+1;
        }else{
            end=mid-1;
        }
       

       }
       return -1;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[5];
        int key = sc.nextInt();
        
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();

       }
       System.out.println(binarysearch(arr, key));

    }
    
}
