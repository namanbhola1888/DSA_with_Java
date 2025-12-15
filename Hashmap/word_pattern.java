import java.util.HashMap;
import java.util.HashSet;

public class word_pattern {

    public boolean wordPattern(String pattern, String s) {

        int n = pattern.length();
        String[] arr = s.trim().split("\\s+");
        
        if (n != arr.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>(); 

        for(int i=0; i<n; i++){
            char a = pattern.charAt(i);

            if(map.containsKey(a)){
                if(!map.get(a).equals(arr[i])){
                    System.out.println(map);
                    return false;
                }
            }else{
                if (set.contains(arr[i])) return false;
            
                map.put(a, arr[i]);
                set.add(arr[i]);
            }
        }

        System.out.println(map);
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        word_pattern obj = new word_pattern();
        System.out.println(obj.wordPattern(pattern, s));

    }
}
