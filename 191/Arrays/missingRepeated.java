public class missingRepeated{

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;

        int[] freq = new int[size + 1];

        for(int[] row: grid){
            for(int num: row){
                freq[num]++;
            }
        }

        int repeated = -1;
        int missing = -1;

        for(int i=1; i<=size; i++){
            if(freq[i] == 2){
                repeated = i;
            }
            else if(freq[i] == 0){
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }

    public static void main(String[] args){
        int[][] grid = {
            {1,3},
            {2,2}
        };

        missingRepeated obj = new missingRepeated();
        int[] result = obj.findMissingAndRepeatedValues(grid);
        System.out.println(result[0] + " " + result[1]);
    }
}