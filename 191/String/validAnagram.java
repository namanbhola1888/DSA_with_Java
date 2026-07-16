import java.util.HashMap;

public class validAnagram {

    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){

            char c = s.charAt(i);
            char d = t.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);
            map.put(d, map.getOrDefault(d, 0) - 1);
        }

        for(int val: map.values()){
            if(val != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // String s = "anagram";
        // String t = "nagaram";   

        String s = "car";
        String t = "rat";   

        validAnagram obj = new validAnagram();
        System.out.println(obj.isAnagram(s, t));
    }
}
