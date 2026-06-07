public class setMatrixZero {

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for(int i=0; i<m; i++){
            if(matrix[0][i] == 0){
                firstRowHasZero = true;
                break;
            }
        }

        for(int i=0; i<n; i++){
            if(matrix[i][0] == 0){
                firstColHasZero = true;
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

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowHasZero) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstColHasZero) {
            for (int i = 0; i < n; i++) {
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

    public static void main(String[] args) {
        int[][] arr = {
            {0,2,3},
            {4,5,6},
            {7,8,0}
        };

        setMatrixZero obj = new setMatrixZero();
        obj.setZeroes(arr);
    }
}
