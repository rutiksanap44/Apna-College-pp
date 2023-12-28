public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
        int[] arr1 = insertionSort(arr);
        for(int i:arr1){
            System.out.println(i);
        }
    }
}
