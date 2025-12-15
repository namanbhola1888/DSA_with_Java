import java.util.HashMap;

public class isomorphic{

    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        if(n != m){
            return false;
        }
        
        char a,b;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i=0; i<n; i++){
            a = s.charAt(i);
            b = t.charAt(i);
            if(map1.containsKey(a)){
                if(map1.get(a) != b){
                    return false;
                }
            }
            else{
                if(map2.containsKey(b)){
                    return false;
                }
                map1.put(a,b);
                map2.put(b,a);
            }
        }
        System.out.println(map1);
        System.out.println(map2);

        return true;
    }

    public static void main(String[] args){

        String s = "paper";
        String t = "title";

        isomorphic obj = new isomorphic();
        System.out.println(obj.isIsomorphic(s,t));
    }
}