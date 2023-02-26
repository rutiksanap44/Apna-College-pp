public class plusOne {
    public static int plusone(int[] digits) {
        int flag = 0;
        int length = 0;
        for(int i:digits){
            // flag = flag*10 + i;
        }
        flag+=1 ;
        // int flag2 = flag;
        // while(flag2>0){
        //     length++;
        //     flag2/=10;
        // }
        // int[] arr = new int[length];
        // int index = length-1;
        // while(flag!=0){
        //     arr[index] = flag%10;
        //     flag/=10;
        //     index--;
        // }
        return flag;
    }
    public static void main(String[] args) {
        int arr1[] = {9,8,7,6,5,4,3,2,1,0};
        // int[] arr = plusone(arr1);
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        System.out.println(plusone(arr1));
    }
}
