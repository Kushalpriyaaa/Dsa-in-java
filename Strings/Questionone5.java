//Check if a String is Plaindrom
//Race Car
//noon
//madam
import java.util.*;


public class Questionone5 {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i) !=str.charAt(n-1-i)){
                //not a plaindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(isPalindrome(str));
    }
    
}
