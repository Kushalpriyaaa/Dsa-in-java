import java.util.*;
public class loop8 {
   //keep entrring a number till user enters a multiple 0f 10
   public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    int n= sc.nextInt();
    for(int i=0; i<=n;i++){

        System.out.println("enter:");
        if(n%10==0){
            break;
        }
        System.out.println(n);


    }
    
   } 
    
}
