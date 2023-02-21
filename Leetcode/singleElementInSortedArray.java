public class singleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int ans = 0;
        if (nums[nums.length - 1] == nums[nums.length - 2]) {
            for (int i = 0; i < nums.length - 1;) {
                if (nums[i] == nums[i + 1]) {
                    i += 2;
                }else{
                    ans = nums[i];
                    break;
                }
            }
        } else {
            ans = nums[nums.length - 1];    
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(arr));
    }

}
