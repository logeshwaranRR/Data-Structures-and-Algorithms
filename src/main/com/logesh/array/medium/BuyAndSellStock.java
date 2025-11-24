package src.main.com.logesh.array.medium;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxzProfit=0;
        for(int i=0;i<prices.length;i++){
           minPrice= Math.min(minPrice,prices[i]);
            maxzProfit=Math.max(maxzProfit,prices[i]-minPrice);
        }
        return maxzProfit;
    }
}
