public class maxDepthParanthesis {
    public int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;

        for(char c: s.toCharArray()){
            if(c == '('){
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            }
            else if(c == ')') currentDepth--;
        }

        return maxDepth;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

        maxDepthParanthesis obj = new maxDepthParanthesis();
        System.out.println(obj.maxDepth(s));
    }
}
