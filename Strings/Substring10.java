public  class Substring10 {
    public static String substring(String str,int si , int ei){
        String substr=" ";
        for(int i=si;i<ei;i++){
            substr +=str.charAt(i);

        }
        return substr;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(substring(str, 0, 5));
        // alternative to print substring 
        //System.out.println(str.substring(0,50));
        
    }


    
}
