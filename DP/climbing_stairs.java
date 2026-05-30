public class climbing_stairs{

    public int climbStairs(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;

        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
            System.out.print(dp[i] + " ");
        }

        return dp[n];
    }

    public static void main(String[] args){
        int n = 3;
        climbing_stairs obj = new climbing_stairs();
        System.out.println(obj.climbStairs(n));
    }
}