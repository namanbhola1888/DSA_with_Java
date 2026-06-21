import java.util.HashMap;

public class longestSubstring {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxlen = 0;
        int n = s.length();

        for(int i=0; i<n; i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>=left){
                left = map.get(s.charAt(i)) + 1;
            }

            map.put(s.charAt(i), i);
            maxlen = Math.max(maxlen, i-left+1);
        }

        return maxlen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        longestSubstring obj = new longestSubstring();
        System.out.println(obj.lengthOfLongestSubstring(s));
    }
}
