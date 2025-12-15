import java.util.HashMap;
import java.util.Map;

public class longest_substr {

    public int lengthOfLongestSubstring(String s) {
        int left =0, maxlen=0;
        Map<Character, Integer> map = new HashMap<>(); 
        int n= s.length();
        for(int right=0; right<n;right++){
            char a = s.charAt(right);

            if(map.containsKey(a) && map.get(a)>=left){
                left = map.get(a) + 1;
            }

            map.put(a, right);
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        longest_substr obj = new longest_substr();
        int c = obj.lengthOfLongestSubstring(s);
        System.out.println(c);
    }
}
