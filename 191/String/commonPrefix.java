import java.util.Arrays;

public class commonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        
        Arrays.sort(strs);
        
        String max = strs[0];
        String min = strs[strs.length - 1];
        StringBuilder s = new StringBuilder();

        int minLen = Math.min(max.length(), min.length());

        for(int i=0; i<minLen; i++){
            if(max.charAt(i) == min.charAt(i)){
                s.append(max.charAt(i));
            }
            else{
                break;
            }
        }

        return s.toString();
    }

    public static void main(String[] args){
        String[] s = {"flower", "flow", "flight"};

        commonPrefix obj = new commonPrefix();
        System.out.println(obj.longestCommonPrefix(s));
    }
}
