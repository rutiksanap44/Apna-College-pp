//bruit force method
public class max_subarray_sum {
    public static void main(String1[] args) {
        int[] arr = {1,2,-3,3,4,-4};
        int finalSum = 0;
        int currentSum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    currentSum+=arr[k];
                }
                if(finalSum<currentSum){
                    finalSum = currentSum;
                }
                currentSum = 0;
            }
        }
        System.out.println(finalSum);
    }
}
