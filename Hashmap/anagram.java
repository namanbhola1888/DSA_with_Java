import java.util.HashMap;

public class anagram{

    public boolean isAnagram(String s, String t) {

        int n = s.length();
        int m = t.length();

        if(m != n){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            map.put(a, map.getOrDefault(a, 0) +1);
            map.put(b, map.getOrDefault(b, 0) -1);
        }

        for(int count : map.values()){
            if(count!= 0){
                System.out.println(map);
                return false;
            }
        }
        
        System.out.println(map);
        return true;
    }

    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";
        anagram obj = new anagram();
        System.out.println(obj.isAnagram(s, t));
    }
}