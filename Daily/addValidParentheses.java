public class addValidParentheses{
    public int minAddToMakeValid(String s) {
        int open = 0, add = 0;

        for(char c: s.toCharArray()){
            if(c == '('){
                open++;
            }
            else{
                if(open > 0){
                    open--;
                }
                else{
                    add++;
                }
            }
        }

        return add + open;
    }

    public static void main(String[] args) {
        String s = "(((";

        addValidParentheses obj = new addValidParentheses();
        System.out.println(obj.minAddToMakeValid(s));
    }
}