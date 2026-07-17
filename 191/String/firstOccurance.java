public class firstOccurance {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if(m == 0) return -1;

        for(int i=0; i<=n-m; i++){
            String window = haystack.substring(i, i+m);
            if(window.equals(needle)) return i;
        }

        return -1;
    }

    public static void main(String[] args){
        String haystack = "sadbutsad"; 
        String needle = "sad";

        firstOccurance obj = new firstOccurance();
        System.out.println(obj.strStr(haystack, needle));
    }
}
