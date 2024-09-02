public class A9 {
    public static void Kadanes(int arr[]){
        int cs=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            max=Math.max(cs,max);
        }
        System.out.println((max));

    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
      Kadanes(arr);
        
    }
    
}
