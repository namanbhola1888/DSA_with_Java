public class search_2D {
    public boolean searchMatrix(int[][] matrix, int target) {

        int low = 0;
        int m = matrix.length;      // rows
        int n = matrix[0].length;   // cols
        int high = (m*n)-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            int row= mid /n;
            int col = mid%n;

            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }

    public static void main(String[] args){
        int[][] arr = {
            {1,3,5,7},
            {10,11,16,17},
            {23,30,34,60}
        };
        int target = 33;

        search_2D obj = new search_2D();
        System.out.println(obj.searchMatrix(arr, target));
    }
}   
