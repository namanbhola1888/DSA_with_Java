public class Sell_Buy{

    public int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }

    public int maxProfit(int[] prices) {
        int profit= 0;
        int n = prices.length;
        int buy = Integer.MAX_VALUE;

        for (int i = 0; i <n; i++) {
            if(prices[i] < buy){
                buy = prices[i];
                System.out.println("Buy: " + buy);
            }
            else{
                profit = max(profit, prices[i] - buy);
            }
        }
        
        return profit;
    }

    public static void main(String[] args){
        int[] nums = {7,1,5,3,6,4};
        Sell_Buy obj = new Sell_Buy();
        int max = obj.maxProfit(nums);
        System.out.println(max);
    }
}