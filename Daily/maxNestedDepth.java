public class maxNestedDepth{
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] answer = new int[n];
        int currentDepth = 0;

        for(int i=0; i<n; i++){
            char c = seq.charAt(i);

            if(c == '('){
                answer[i] = currentDepth%2;
                currentDepth++;
            }
            else if(c == ')'){
                currentDepth--;
                answer[i] = currentDepth%2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "(()())";
        maxNestedDepth obj = new maxNestedDepth();

        int[] result = obj.maxDepthAfterSplit(s);

        for(int num: result){
            System.out.print(num + " ");
        }
    }
}