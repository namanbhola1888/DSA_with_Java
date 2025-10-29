public class subsequence{

    public boolean isSubsequence(String s, String t) {

        int s_length = s.length();
        if(s_length == 0 ){
            return true;
        }

        int left =0 , right =0;

        while(left < t.length()){

            if(t.charAt(left) == s.charAt(right)){
                right++;
            }
            
            left++;

            if(right == s_length){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "b";
        String t = "v";

        subsequence obj = new subsequence();
        boolean c = obj.isSubsequence(s,t);
        System.out.println(c);
    }
}