public class reverse_bits {
    public int reverseBits(int n) {
        System.out.println("Original: " + n);

        String binaryString = Integer.toBinaryString(n);
        System.out.println("In Binary: " + binaryString);

        StringBuilder stringBuilder = new StringBuilder(binaryString);
        stringBuilder.reverse();
        String reversedString = stringBuilder.toString();
        System.out.println("Reversed: " + reversedString);

        int decimalNumber = Integer.parseInt(reversedString, 2);    
        System.out.println("Decimal: " + decimalNumber);    

        return decimalNumber;
    }
    public static void main(String[] args) {
        int n = 43261596;

        reverse_bits obj = new reverse_bits();
        System.out.println(obj.reverseBits(n));
    }
}
