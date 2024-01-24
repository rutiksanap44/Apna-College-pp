public class IntersectionOfArrays {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                count++;
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 3, 4, 5, 6 };
        int[] arr2 = { 3, 5 };
        System.out.print(NumberofElementsInIntersection(arr1, arr2, arr1.length, arr2.length));

    }
}
