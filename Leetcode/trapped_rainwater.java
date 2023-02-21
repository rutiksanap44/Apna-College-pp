public class trapped_rainwater {

    // to find the left max array
    public static int[] leftMax(int[] arr){
        int[] arr1 = new int[arr.length];
        arr1[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            arr1[i] = Math.max(arr[i], arr1[i-1]);
        }
        return arr1;
    }

    // to find the right max of array
    public static int[] rightMax(int[] arr){
        int[] arr1 = new int[arr.length];
        arr1[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr1[i] = Math.max(arr[i],arr1[i+1]);
        }
        return arr1;
    }

    public static int trappedRainwater(int[] n){
        int waterLevel;
        int[] leftMax = leftMax(n);
        int[] rightMax = rightMax(n);
        int trappedWater = 0;
        for(int i=0;i<n.length;i++){
            waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - n[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,4};
        // trappedRainwater(arr);
        System.out.println(trappedRainwater(arr));
    }
}
