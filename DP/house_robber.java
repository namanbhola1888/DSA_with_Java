public class house_robber {

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            if(i%2 == 0) continue;

            dp[i] = dp[i-1] + dp[i-2];
            System.out.print(dp[i] + " ");
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        house_robber obj = new house_robber();
        System.out.println(obj.rob(nums));
    }
}
