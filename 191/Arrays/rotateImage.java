public class rotateImage{

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int left;
        int right;

        for(int i=0; i<n; i++){
            left = 0;
            right = n-1;

            while(left <= right){
                temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        rotateImage obj = new rotateImage();
        obj.rotate(matrix);

        for (int[] matrix1 : matrix) {
            for (int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
    }
}