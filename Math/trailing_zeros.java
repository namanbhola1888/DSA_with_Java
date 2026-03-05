public class trailing_zeros {

    public int trailingZeroes(int n) {
        int count = 0;

        while(n>0){
            n /=5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 30;
        trailing_zeros obj = new trailing_zeros();
        System.out.println(obj.trailingZeroes(n));
    }    
}
