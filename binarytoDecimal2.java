public class binarytoDecimal2 {
    public static int binary_to_decimal(String str) {
        int power = 0;
        int lastDigit = 0;
        int sum = 0;
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            int temp = Integer.parseInt(String.valueOf(str.charAt(i)));
            flag = flag * 10 + temp;
        }
        while(flag>0){
        lastDigit = flag%10;
        sum = sum + lastDigit * (int)Math.pow(2, power);
        power++;
        flag/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(binary_to_decimal("101100"));
    }
}
