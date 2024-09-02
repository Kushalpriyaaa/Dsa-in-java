public class A12 {
    public static int Stocks(int arr[]){
        int buy=arr[0];
        int profit =0;
        for(int i=0;i<arr.length;i++){
            if(buy<arr[i]){
                profit=Math.max(arr[i]-buy,profit);
            }
            else{
                buy=arr[i];

            } 
        
        }
        return profit;

    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(Stocks(arr));
    }
    
}
