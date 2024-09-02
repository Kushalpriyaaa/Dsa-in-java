import java.util.*;


public class A3 {

    public static int LargestNumber(int arr[]){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           
            if (arr[i]>max){
               max=arr[i];
               return max;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int [5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // Read integers from the user
        }
        System.out.println(LargestNumber(arr));

        
    }
    
}
