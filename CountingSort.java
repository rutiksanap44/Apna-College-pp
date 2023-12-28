public class CountingSort {
    public static int[] countingSort(int[] arr){
        int max = 0;
        for(int i:arr){
            if(i>max){
                max = i;
            };
        };
        int[] arrNew = new int[max+1];
        for(int j=0;j<arr.length;j++){
            arrNew[arr[j]]++;
        };
        int k = 0;
        for(int l=0;l<arrNew.length;l++){
            while(arrNew[l]>0){
                arr[k]=l;
                k++;
                arrNew[l]--;
            };
        };
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        int[] arr1 = countingSort(arr);
        for(int i:arr1){
            System.out.println(i);
        }
    }
}
