public class firstOccurance {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if(n < m) return -1;

        for(int i=0; i<n-m; i++){
            for(int j=0; j<m; j++){
                if(haystack.charAt(i) != needle.charAt(j)) break;
            }
        }

        return 0;
    }

    public static void main(String[] args){
        String haystack = "sadbutsad"; 
        String needle = "sad";

        firstOccurance obj = new firstOccurance();
        System.out.println(obj.strStr(haystack, needle));
    }
}
