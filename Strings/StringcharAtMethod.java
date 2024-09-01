public class StringcharAtMethod {
  public static void printLettters(String str){
    for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i)+" ");
    }
  
  }

    public static void main(String[] args) {
      // if we want to know the index of any letter in a word we use the method char At
      
      String firstName = "Kushal";
        String LastName="Priya";
        String FullName =firstName+ " "+LastName;
       // System.out.println(FullName.charAt(0) );
      printLettters(FullName);
        
    }
    
}
