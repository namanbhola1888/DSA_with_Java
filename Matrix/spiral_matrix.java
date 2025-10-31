import java.util.List;
import java.util.ArrayList;

public class spiral_matrix{

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        int top=0, left=0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;

        while(top <= bottom && left<=right){

            for(int i=left; i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }

            right--;

            if(top<=bottom){
                for(int i=right; i>= left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        spiral_matrix obj = new spiral_matrix();
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(obj.spiralOrder(matrix));
    }
}