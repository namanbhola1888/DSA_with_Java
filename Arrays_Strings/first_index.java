public class first_index{

    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if(m == 0){
            return -1;
        }

        for(int i=0; i<=n-m; i++){
            String window = haystack.substring(i, i + m);
            if (window.equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        String haystack = "leetcode";
        String needle = "leeto";

        first_index obj = new first_index();
        int c = obj.strStr(haystack, needle);
        System.out.println(c);

    }
}