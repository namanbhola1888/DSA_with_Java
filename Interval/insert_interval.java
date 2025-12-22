import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insert_interval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int n = newInterval.length;
        
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                list.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        list.add(new int[]{start, end});

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] interval = {
            {1,3}, {6,9}
        };
        int[] newInterval = {2,5};

        insert_interval obj = new insert_interval();
        int[][] result = obj.insert(interval, newInterval);

        System.out.println(Arrays.deepToString(result));
    }   
}
