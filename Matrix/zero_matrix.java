public class zero_matrix{

    public void setZeroes(int[][] matrix) {
        
        boolean rowhaszero = false;
        boolean colhaszero = false;

        int n = matrix.length;
        int m = matrix[0].length;

        for(int j=0; j<m; j++){
            if(matrix[0][j] == 0){
                rowhaszero = true;
                break;
            }
        }

        for(int i=0; i<n; i++){
            if(matrix[i][0] == 0){
                colhaszero = true;
                break;
            }
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][0] == 0 || (matrix[0][j] == 0)){
                    matrix[i][j] = 0;
                }
            }
        }

        if (rowhaszero) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 6: Zero out the first column if needed
        if (colhaszero) {
            for (int i = 0; i <n;i++) {
                matrix[i][0] = 0;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args){
        int[][] arr = {
            {0,2,3},
            {4,5,6},
            {7,8,0}
        };

        zero_matrix obj = new zero_matrix();
        obj.setZeroes(arr);
    }
}