import java.util.*;
public class A6 {
    public static void printpairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int currentno=arr[i];
            for(int j=i+1; j<arr.length;j++){
                System.out.print("("+currentno+","+arr[j]+")");

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printpairs(arr);
        
    }
    
}