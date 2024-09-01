public class StringComparision9 {
    public static void main(String[] args) {
        String s1="Kushal";
        String s2="Kushal";
        String s3=new String("Kushal");
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String are not equal");
        }
    }
    
}
