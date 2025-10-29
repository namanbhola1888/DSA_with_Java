public class palindrome {

    public boolean isPalindrome(String s) {
        int left =0, right = s.length()-1;

        while(left < right){
            char cleft = s.charAt(left);
            char cright = s.charAt(right);

            if(!Character.isLetterOrDigit(cleft)){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(cright)){
                right--;
                continue;
            }

            if (Character.toLowerCase(cleft) != Character.toLowerCase(cright)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args){
        String s = " ";
        palindrome obj = new palindrome();
        boolean c = obj.isPalindrome(s);
        System.out.println(c);
    }
}
