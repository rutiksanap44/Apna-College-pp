public class kadans {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int currentSum = 0;
        int finalSum = 0;
        for (int i : arr) {
            if (i < 0 && currentSum == 0) {
                currentSum += 0;
            } else {
                currentSum += i;
            } // 0 0 4 3 1 2 7 4
            if (finalSum < currentSum) {
                finalSum = currentSum; // 0 0 4 4 4 4 7 7
            }
        }
        System.out.print("Maximum sum by Kadan\'s method is : "+finalSum);
    }
}