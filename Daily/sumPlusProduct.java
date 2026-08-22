public class sumPlusProduct{
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum = 0;
        int product = 1;

        while(n > 0){
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        return original % (sum + product) == 0;
    }

    public static void main(String[] args){
        int n = 23;
        int m = 99;

        sumPlusProduct obj = new sumPlusProduct();
        System.out.println(obj.checkDivisibility(n));
        System.out.println(obj.checkDivisibility(m));
    }
}