public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int sell = 0, buy = prices[0], profit = 0;
        for (int i = 1; i < prices.length; i++) {
            sell = prices[i];
            buy = Math.min(prices[i], buy);
            profit = Math.max(profit,sell-buy);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 2, 4};
        System.out.println(maxProfit(arr));
    }
}
