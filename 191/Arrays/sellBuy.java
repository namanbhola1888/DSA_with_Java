public class sellBuy{

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int buy = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else{
                profit = Math.max(profit, prices[i]-buy);
            }
        }
        return profit;   
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        sellBuy obj = new sellBuy();

        System.out.println(obj.maxProfit(prices));
    }
}