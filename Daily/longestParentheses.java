import java.util.Stack;

public class longestParentheses{

    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int result = 0;
        st.push(-1);
        int n = s.length();

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    result = Math.max(result, i-st.peek());
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "(()";

        longestParentheses obj = new longestParentheses();
        System.out.println(obj.longestValidParentheses(s));
    }
}