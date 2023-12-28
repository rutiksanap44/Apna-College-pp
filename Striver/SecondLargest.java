public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {-20, -30, 40, 25, 10};
        int Largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        int flag = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                flag++;
            }
            if (flag != 0) {
                if (Largest < arr[i]) {
                    secondLargest = Largest;
                    Largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] < Largest) {
                    secondLargest = arr[i];
                }
            }
        }
        System.out.println(secondLargest);
    }
}