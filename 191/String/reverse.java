public class reverse{

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int n = words.length;
        StringBuilder st = new StringBuilder();

        for(int i=n-1; i>=0; i--){
            st.append(words[i]);
            if(i!=0) st.append(" ");   
        }

        return st.toString();
    }

    public static void main(String[] args){
        String s = "the sky is blue";
        reverse obj = new reverse();

        System.out.println(obj.reverseWords(s));
    }
}