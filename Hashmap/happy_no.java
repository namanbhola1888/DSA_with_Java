public class happy_no{

    public boolean isHappy(int n) {

        int sum=0;
        int number = n;
        int iter = 0;
        while(iter < 20){

            if(number == 1){
                return true;
            }

            System.out.println("Number: " + number);
            sum=0;
            while(number>0){
                int digit = number%10;
                sum+= digit * digit;
                number /= 10;
            }

            System.out.println("Sum: " +  sum);
            number = sum;
            iter++;
        }

        return false;
    }

    public static void main(String[] args) {
        int n= 19;
        happy_no obj = new happy_no();
        System.out.println(obj.isHappy(n));
    }
}