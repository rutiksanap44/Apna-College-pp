public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        // [0,1,0,3,12]
        // [1,3,12,0,0]
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j!=-1){
            for (int i = j+1; i < nums.length; i++) {
                if(nums[i]!=0){
                    int temp = nums[i];
                    nums[i]=0;
                    nums[j]=temp;
                    j++;
                }
            }
        }
        for (int i : nums) {
                System.out.print(i+",");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0};
        moveZeroes(arr);
    }
}
