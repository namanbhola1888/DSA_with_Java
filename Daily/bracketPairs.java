import java.util.HashMap;
import java.util.List;

public class bracketPairs {

    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder result = new StringBuilder();
        int n = s.length();

        HashMap<String, String> map = new HashMap<>();
        for(List<String> pair: knowledge){
            map.put(pair.get(0), pair.get(1));
        }

        for(int i=0; i<n; i++){
            char c = s.charAt(i);

            if(c == '('){
                StringBuilder temp = new StringBuilder();
                i++;
                while (i < n && s.charAt(i) != ')') {
                    temp.append(s.charAt(i));
                    i++;
                }

                if(map.containsKey(temp.toString())){
                    result.append(map.get(temp.toString()));
                }
                else{
                    result.append('?');
                }
            }

            else{
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(name)is(age)yearsold";
        List<List<String>> knowledge = List.of(
            List.of("name", "bob"),
            List.of("age", "two")
        );

        bracketPairs obj = new bracketPairs();
        System.out.println(obj.evaluate(s, knowledge));
    }
}
