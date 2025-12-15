// 18

public class last_word {

    public int lengthOfLastWord(String s) {
        int count=0;
        String last = "";
        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c != ' '){
                last = c + last;
                count+=1;
            }
            else{
                if(count >0){
                    System.out.println("Last Word: "+last);
                    return count;
                }
            }
        }
        
        System.out.println("Last Word: "+last);
        return count;
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        last_word obj = new last_word();
        int c = obj.lengthOfLastWord(s);
        System.out.println(c);
    }
}
