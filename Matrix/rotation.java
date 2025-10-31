public class rotation {

    public void rotate(int[][] matrix) {
        // 1st - Transpose
        int n = matrix.length;
        int temp;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reversing each row
        int left;
        int right;

        for(int i=0; i<n; i++){
            left = 0;
            right = n-1;
            
            while(left<right){
                temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        long startTime = System.nanoTime();   

        rotation obj = new rotation();
        obj.rotate(arr);

        long endTime = System.nanoTime();    
        long duration = endTime - startTime;  

        System.out.println("Execution time: " + duration + " ns");
        System.out.println("Execution time: " + (duration / 1_000_000.0) + " ms");
    }
}
