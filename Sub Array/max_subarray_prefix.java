public class max_subarray_prefix {
    public static void main(String1[] args) {
        int[] arr = {1,-2,6,-1,3};
        int[] arr1 = new int[arr.length];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr1[i]=sum;
        }
        int currentSum = 0;
        int finalSum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                currentSum = i == 0 ? arr1[j] : arr1[i] - arr[i-1];
            }
            if(currentSum>finalSum){
                finalSum = currentSum;
            }
            currentSum = 0;
        }
        System.out.print(finalSum);
    }
}
