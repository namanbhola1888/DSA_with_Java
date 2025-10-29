// 19

public class reverse_words {

    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1; i>=0;i--){
            sb.append(words[i]);
            if(i!=0) sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "  a good   example  ";
        reverse_words obj = new reverse_words();
        String s = obj.reverseWords(a);
        System.out.println(s);
    }
}
