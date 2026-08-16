public class stoneGame9{

    public boolean stoneGameIX(int[] stones) {
        int[] f = { 0, 0, 0 };

        for (int s : stones) {
            f[s % 3]++;
        }
        
        if ((f[0] & 1) == 0) {
            return Math.min(f[1], f[2]) > 0;
        }

        return Math.abs(f[1] - f[2]) > 2;
    }

    public static void main(String[] args) {
        int[] stones = {2,1};

        stoneGame9 obj = new stoneGame9();
        System.out.println(obj.stoneGameIX(stones));
    }
}