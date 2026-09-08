public class distinctSubsequence2 {

    public int distinctSubseqII(String s) {
        final long MOD = 1_000_000_007L;

        long dp = 1;
        long[] last = new long[26];

        for(char c : s.toCharArray()){
            int index = c - 'a'; 
            long newDp = (2 * dp - last[index] + MOD) % MOD;

            last[index] = dp;
            dp = newDp;
        }

        return (int) ((dp - 1 + MOD) % MOD);
    }

    public static void main(String[] args) {
        String s = "abc";

        distinctSubsequence2 obj = new distinctSubsequence2();
        System.out.println(obj.distinctSubseqII(s));
    }
}
