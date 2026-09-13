import java.util.List;
import java.util.ArrayList;

public class imageOverlap {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;

        List<int[]> A = new ArrayList<>();
        List<int[]> B = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(img1[i][j] == 1) A.add(new int[]{i,j});
                if(img2[i][j] == 1) B.add(new int[]{i,j});
            }
        }

        int[][] cnt = new int[2*n][2*n];
        int best = 0;

        for(int[] a: A){
            for(int[] b: B){
                int dx = b[0] - a[0] + n;
                int dy = b[1] - a[1] + n;
                best = Math.max(best, ++cnt[dx][dy]);
            }
        }

        return best;
    }

    public static void main(String[] args) {
        int[][] arr1 = {
            {1,1,0},{0,1,0},{0,1,0}
        };

        int[][] arr2 = {
            {0,0,0},{0,1,1},{0,0,1}
        };

        imageOverlap obj = new imageOverlap();
        System.out.println(obj.largestOverlap(arr1, arr2));
    }
}