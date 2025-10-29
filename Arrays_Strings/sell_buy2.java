

public class sell_buy2 {

    public int max(int a,int b){
        return (a>b)? a:b;
    }

    public int maxProfit(int[] prices) {
        int max_profit=0;
        int n = prices.length;
        
        for (int i = 0; i <n-1; i++) {
            int current_profit = prices[i+1] - prices[i];
            System.out.println("(" + prices[i+1] + " - " + prices[i] + ") = "+ (prices[i+1] - prices[i]));
            if(current_profit > 0){
                System.out.println("Current Profit: " + current_profit);
                max_profit+= current_profit;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        sell_buy2 obj = new sell_buy2();
        int c = obj.maxProfit(prices);
        System.out.println(c);
    }
}
