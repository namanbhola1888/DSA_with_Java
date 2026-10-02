import java.util.List;
import java.util.ArrayList;

public class parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();

        dfs(n, n, curr, ans);
        return ans;
    }

    private void dfs(int open, int close, StringBuilder curr, List<String> ans){
        if(open == 0 && close == 0){
            ans.add(curr.toString());
            return;
        }

        if(open > 0){
            curr.append('(');
            dfs(open - 1, close, curr, ans);
            curr.deleteCharAt(curr.length() - 1);
        }

        if(close > open){
            curr.append(')');
            dfs(open, close - 1, curr, ans);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;

        parentheses obj = new parentheses();
        System.out.println(obj.generateParenthesis(n));
    }
}
