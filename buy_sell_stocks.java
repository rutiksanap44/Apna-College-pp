public class buy_sell_stocks {
    public static int maxProfit(int[] arr){
        int minBP = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int i:arr){
            if(minBP>i){
                minBP = i;
            }
            int currProfit = i - minBP;
            if(currProfit>profit){
                profit = currProfit;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}
