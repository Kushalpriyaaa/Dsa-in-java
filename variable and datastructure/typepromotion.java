 /* public class typepromotion {
    public static void main(String[] args) {
        char a= 'a';
        char b= 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(a); /* (type promotion is only done wit expression(ex-a+b,m*n+k) */
       // System.out.println(b-a);
        //}
    
//}  */

//other ex
public class typepromotion{
    public static void main(String[] args) {
        short a=5;
        byte b=25;
        char c = 'c';
        //byte bt=a+b+c;
        // as error given int cannot be converted into byte
        //because in type promotion expression are automatically converted into int(byte,short,or char)
        
        byte bt= (byte)(a+b+c);

    }
}
