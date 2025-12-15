// 19

import java.util.Arrays;

public class common_prefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);

        System.out.println(Arrays.toString(strs));

        String first = strs[0];
        String last = strs[strs.length-1];
        StringBuilder s = new StringBuilder();
        int minLen = Math.min(first.length(), last.length());

        for(int i=0;i<minLen;i++){

            if(first.charAt(i) == last.charAt(i)){
                s.append(first.charAt(i));
            }
            else{
                break;
            }
        }

        return s.toString();
    }


    public static void main(String[] args) {
        String[] arr = {"dog","racecar","car"};
        
        common_prefix obj = new common_prefix();  
        String s = obj.longestCommonPrefix(arr); 
        System.out.println(s);
    }
}
