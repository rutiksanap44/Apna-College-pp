public class MissingNumber{
    public static int missingNumber(int array[], int n) {
        // Your Code Here {1,2,3,5}
        int i=0;
        int[] arr = new int[n+1];
        for(i=0;i<=n;i++){
            arr[i]=0;
        }
        for(i=0;i<n;i++){
            arr[array[i]-1] = 1;
        }
        int ans = 0;
        for(i=0;i<=n;i++){
            if(arr[i]==0){
                ans = i+1;
            }
        }
        return ans;
    }
    public static int missingNumber1(int[] nums){
        int[] temp = new int[nums.length+1];
        
        for(int i=0;i<temp.length;i++){
            temp[i]=-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp[nums[i]-1]=1;
            }
            else{
                temp[0]=1;
            }
        }
        int ans = 0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]==-1){
                ans = i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber1(arr));
    }
}