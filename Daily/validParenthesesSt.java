public class validParenthesesSt{
    public boolean checkValidString(String s) {
        int open = 0;
        int close = 0;
        int n = s.length();

        for(int i=0; i<n; i++){
            open += s.charAt(i) == '(' ? 1 : -1;
            close += s.charAt(i) == ')' ? -1 : 1;

            if(close < 0) return false;
            open = Math.max(open, 0);
        }

        return open == 0;
    }

    public static void main(String[] args){
        String s = "(*))";

        validParenthesesSt obj = new validParenthesesSt();
        System.out.println(obj.checkValidString(s));
    }
}