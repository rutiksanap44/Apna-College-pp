public class ArraySortedOrNot {

    public static int arraySortedOrNot(int[] arr, int n) {
        // code here
        int ans = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                ans=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {90, 80, 100, 70, 40, 30};
        System.out.println(arraySortedOrNot(arr, 0));
    }
}
