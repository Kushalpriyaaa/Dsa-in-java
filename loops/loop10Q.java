/*import java.util.*;
public class loop10Q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");

        }
    }
}*/
import java.util.*;
public class loop10Q{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of integer");
        int num=sc.nextInt();//to read number
         int evensum=0;
         int oddsum=0;
         System.out.println("Enter the integer:");
         for(int i=0;i<num; i++){
            int currentNumber= sc.nextInt();
            if(currentNumber%2 ==0){
                evensum += currentNumber;
            }else{
                oddsum += currentNumber;
            }


         }
         System.out.println(("Sum of even Number: "+evensum));
         System.out.println("Sum of odd numbers: "+oddsum);



        
    }
    
}

