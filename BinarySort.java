public class BinarySort {
    public static int[] binarySort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {8,7,2,1,9,10,3};
        int[] arr1 = binarySort(arr);
        for(int i:arr1){
            System.out.println(i);
        }
    }
}
