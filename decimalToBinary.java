public class decimalToBinary {
    public static int decimaltoBinary(int n) {
        int flag = 0;
        int ans = 0;
        while (n > 0) {
            int rem = n % 2;
            ans = ans + rem * (int) Math.pow(10, flag);
            n = n / 2;
            flag++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print(decimaltoBinary(7));
    }
}
