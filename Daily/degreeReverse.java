public class degreeReverse {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum = 0;

        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            sum += (26 - (c - 'a')) * (i+1);
        }

        return sum;
    }

    public static void main(String[] args) {
        String s = "abc";

        degreeReverse obj = new degreeReverse();
        System.out.println(obj.reverseDegree(s));
        
    }
}
