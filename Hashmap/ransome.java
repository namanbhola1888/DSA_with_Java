import java.util.HashMap;

public class ransome {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = ransomNote.length();
        char a;

        for(int i=0; i<n; i++){
            a = ransomNote.charAt(i);
            if(map.containsKey(a)){
                map.put(a, map.get(a) + 1);
            }
            else{
                map.put(a,1);
            }
        }
        System.out.println(map);

        int m = magazine.length();

        for(int i=0; i<m; i++){
            a = magazine.charAt(i);
            if(map.containsKey(a)){
                map.put(a, map.get(a) - 1);
                if(map.get(a) == 0){
                    map.remove(a);
                }
            }  
        }

        System.out.println(map);

        return map.isEmpty();
    }

    public static void main(String[] args){
        String ransome = "aab";
        String magazine = "aabbcc";
        ransome obj = new ransome();
        System.out.println(obj.canConstruct(ransome, magazine));
    }
}
