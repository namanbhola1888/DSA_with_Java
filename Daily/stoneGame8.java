public class stoneGame8{

    public int stoneGameVIII(int[] stones) {
        int n = stones.length;

        for(int i=1; i<n; i++){
            stones[i] += stones[i-1];
        }

        int ans = stones[n-1];

        for(int i=n-2; i>0; i--){
            ans = Math.max(ans, stones[i] - ans);
        }

        return ans;
    }

    public static void main(String[] args){
        int[] stones = {-1, 2, -3, 4, -5};

        stoneGame8 obj = new stoneGame8();
        System.out.println(obj.stoneGameVIII(stones));
    }
}