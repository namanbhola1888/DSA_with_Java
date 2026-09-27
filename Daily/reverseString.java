import java.util.ArrayDeque;
import java.util.Deque;

public class reverseString {
    public String reverseParentheses(String s) {
        Deque<String> dq = new ArrayDeque<>();
        StringBuilder current = new StringBuilder();

        for(char c: s.toCharArray()){

            if(c == '('){
                dq.push(current.toString());
                current.setLength(0);
            }
            else if(c == ')'){
                current.reverse();
                current.insert(0, dq.pop());
            }
            else{
                current.append(c);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        String s = "(u(love)i)";

        reverseString obj = new reverseString();
        System.out.println(obj.reverseParentheses(s));
    }
}
