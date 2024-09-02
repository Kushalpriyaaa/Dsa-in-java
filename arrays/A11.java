public class A11 {
    public static boolean duplicate(int sums[]){
        for(int i=0;i<sums.length;i++){
            for(int j=i+1; j<sums.length;j++){
                if(sums[i]==sums[j]){
                    return true;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] sums={1,1,1,3,3,4,3,2,4,2};
        System.out.println(duplicate(sums));
        
    }
    
}
