public class stringToInteger{

    public int myAtoi(String s) {
        
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            char c = s.charAt(i);

            if(c == '-'){
                sb.append(c);
            }
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }

        return Integer.parseInt(sb.toString());   
    }

    public static void main(String[] args){
        String s ="-42";
        stringToInteger obj = new stringToInteger();

        System.err.println(obj.myAtoi(s));
    }
}