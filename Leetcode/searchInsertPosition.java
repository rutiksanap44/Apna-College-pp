public class searchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int ans = 0;
        if(target < nums[0]){
            ans = 0;
        }
        else if(target > nums[nums.length-1]){
            ans = nums.length;
        };
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<target && nums[i+1]>target){
                ans = i+1;
            }
        };
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                ans = i;
            }
        };
        return ans;
    };
    public static void main(String[] args) {
    int[] arr = {1,3,5,6};
    int answer = searchInsert(arr, 5);
    System.out.println(answer);
    }
};

