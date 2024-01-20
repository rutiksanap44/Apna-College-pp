public class RoateArray {
    public static void rotate(int[] nums, int k) {
        // [1,2]
        // [2,1]
        if(k>nums.length){
            k=k%nums.length;
        }
        if(nums.length!=1){
            int[] temp = new int[nums.length-k];
            for(int i=0;i<temp.length;i++){
                temp[i]=nums[i];
            }
            int j=0;
            for(int i=nums.length-k;i<nums.length;i++){
                nums[j]=nums[i];
                j++;
            }
            int m=0;
            for(int i=k;i<nums.length;i++){
                nums[i]=temp[m];    
                m++;
            }
        }
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        rotate(arr, 3);
    }
}
