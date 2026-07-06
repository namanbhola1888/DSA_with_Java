import java.util.Arrays;

public class assignCookies{

    public int findContentChildren(int[] g, int[] s) {
        int content = 0;
        int n = g.length;
        int m = s.length;

        if(m == 0){
            return 0;
        }

        Arrays.sort(g);
        Arrays.sort(s);
        
        int i = 0;
        int j = 0;


        while(i < n && j<m){
            if(s[j] >= g[i]){
                i++;
                j++;
                content++;
            }
            else{
                j++;
            }
        }

        return content;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};

        assignCookies obj = new assignCookies();
        System.err.println(obj.findContentChildren(g, s));
    }
}