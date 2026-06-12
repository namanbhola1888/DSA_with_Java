import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeInterval {

    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=0; i<n; i++){
            if(intervals[i][0] <= end){
                end = Math.max(end, intervals[i][1]);
            }
            else{
                list.add(new int[] {start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        list.add(new int[] {start, end});

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {4,7}, {1,4}
        };

        mergeInterval obj = new mergeInterval();
        int[][] result = obj.merge(intervals);

        System.out.println(Arrays.deepToString(result));
    }
}
