public class addBinary {
    public String addBinary(String a, String b) {
        String result = "";
        int carry = 0; 

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int bit_a = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bit_b = (j >= 0) ? b.charAt(j) - '0' : 0;

            int total = bit_a + bit_b + carry;
            int result_bit = total % 2;
            carry = total / 2;

            result = result_bit + result;

            i--;
            j--;
        }
        
        if(carry == 1){
            result = 1 + result;
        }

        return result;
    }

    public static void main(String[] args) {
        String a = "100";
        String b = "101";

        addBinary obj = new addBinary();
        System.out.println(obj.addBinary(a, b));
    }
}
