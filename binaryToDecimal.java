public class binaryToDecimal {
    public static int binarytoDecimal(int n){
        int power = 0;
        int lastDigit = 0;
        int sum = 0;
        int flag = n;
        while(flag>0){
            lastDigit = flag%10;
            sum = sum + lastDigit * (int)Math.pow(2, power);
            power++;
            flag/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int ans = binarytoDecimal(10001000);
        System.out.println(ans);
    }
}
