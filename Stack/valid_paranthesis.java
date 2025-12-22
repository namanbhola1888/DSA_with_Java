import java.util.Map;
import java.util.Stack;

public class valid_paranthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
        );
  

        int n = s.length();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() != map.get(c)){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }

        return false;   
    }

    public static void main(String[] args) {
        String input = "()";

        valid_paranthesis obj = new valid_paranthesis();
        System.out.println(obj.isValid(input));
    }
}
