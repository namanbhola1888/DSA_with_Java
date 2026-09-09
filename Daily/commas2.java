public class commas2 {

    public long countCommas(long n) {
        long power = 1000;
        long ans = 0;

        while(power <= n){
            ans += n - power + 1;
            power *= 1000;
        }

        return ans;
    }

    public static void main(String[] args) {
        long n = 1004590;

        commas2 obj = new commas2();
        System.out.println(obj.countCommas(n));
    }
}
