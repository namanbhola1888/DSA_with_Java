public class power {
    public double myPow(double x, int n) {

        double result = 1;
        long exp = n;

        if(exp < 0){
            x = 1 /x;
            exp = -exp;
        }

        while(exp > 0){
            if(exp %2 != 0){
                result = result * x;
            }
            x = x * x;
            exp = exp / 2;
        }

        return result;
    }       

    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;

        power obj = new power();
        System.out.println(obj.myPow(x, n));
    }
}
