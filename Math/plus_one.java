public class plus_one{
    public int[] plusOne(int[] digits) {

        int n = digits.length-1;

        for(int i=n; i>=0; i--){

            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newarr = new int[digits.length+1];
        newarr[0] = 1;

        return newarr;
    }

    public static void main(String[] args){
        int[] digits = {9};
        // int[] digits = {1,2,3};
        plus_one obj = new plus_one();

        int[] arr = obj.plusOne(digits);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}