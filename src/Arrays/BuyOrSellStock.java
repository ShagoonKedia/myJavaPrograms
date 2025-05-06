package Arrays;

public class BuyOrSellStock {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
        
    }

    public static int maxProfit(int[] prices){

        if(prices == null || prices.length < 2){
            return 0;
        }

        int minPrice = prices[0];
        int profit = 0;
        
        for(int i = 0; i < prices.length; i++){

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else if(prices[i] - minPrice > profit){
                profit = prices[i] - minPrice;
            }
        }
        return profit;
    }

}
