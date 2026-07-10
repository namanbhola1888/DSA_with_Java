import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class validParanthesis{

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = Map.of(
            ')','(',
            ']','[',
            '}','{'
        );

        for(char c: s.toCharArray()){

            if(!map.containsKey(c)){
                stack.push(c);
            }
            else{
                if (stack.isEmpty() || !stack.pop().equals(map.get(c))) return false;   
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[()]";
        validParanthesis obj = new validParanthesis();
        System.err.println(obj.isValid(s));
    }
}