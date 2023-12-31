public class RemoveDuplicate {
    public static void removeDuplicate(int A[], int n) {
        int i = 0;
        int j = 1;
        int count = 1;
        while (j < A.length - 1) {
            if (A[i] == A[j]) {
                A[j] = A[j + 1];
                i++;
                count++;
            }
            j++;
        }
        for (int a = 0; a <= i + 2; a++) {
            System.out.println(A[a]);
        }

    }

    public static void main(String1[] args) {
        int[] A = { 1, 2, 3, 1, 4, 2, 2, 2, 2, 2, 5 };
        removeDuplicate(A, 0);
    }
}
