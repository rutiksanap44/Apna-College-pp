public class twosum {
    public static int[] findtwosum(int[] nums, int target) {
        return nums;
    }

    public static void main(String[] args) {
        int[] arr1 = { -1, -2, -3, -4, -5 };
        int[] arr = new int[2];
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] + arr1[j] == -8) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
