public class removeElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String1[] args){
        int[] arr1 = {0,1,2,2,3,0,4,2};
        int arr = removeElement(arr1, 2);
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        System.out.println(arr);
    }
}
