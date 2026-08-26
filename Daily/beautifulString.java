public class beautifulString {
    private boolean compare(String a, String b){
        if (a.length() != b.length()) {
            return a.length() < b.length();
        }
    
        return a.compareTo(b) < 0;
    }

    public String shortestBeautifulSubstring(String s, int k) {
        String shortest = "";
        int n = s.length();
        int ones = 0;
        int start = 0;

        for(int i=0; i<n; i++){
            char c = s.charAt(i);

            if(c == '1') ones++;
        }

        if(ones < k) return shortest;
        ones = 0;

        for(int end=0; end<n; end++){
            char c = s.charAt(end);
            if(c == '1'){
                ones++;
            }

            if (ones == k) {
                String current = s.substring(start, end + 1);
            
                if (shortest.equals("") || compare(current, shortest)) {
                    shortest = current;
                }
            }
            
            while (start <= end && (ones == k || s.charAt(start) == '0')) {
                if (s.charAt(start) == '1') {
                    ones--;
                }
                start++;
            }
        }

        return shortest;
    }

    public static void main(String[] args) {
        String s = "100011001";
        int k = 3;

        beautifulString obj = new beautifulString();
        System.out.println(obj.shortestBeautifulSubstring(s, k));
    }
}
