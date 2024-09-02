

public class A10 {
    public static int num(int ms[],int key){
        for(int i=0;i<ms.length;i++){
            if(ms[i]==key){
                return i;
            }


        }
        return-1;

    }
    public static void main(String[] args) {
        int []ms={4,5,6,7,0,1,2};
        int key=3;
        System.out.println(num(ms, key));
        
    }
    
}
