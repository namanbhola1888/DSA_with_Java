import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge_interval {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

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
        int[][] arr = {
            {1,3}, {2,6}, {8,10}, {15,18}
        };

        merge_interval obj = new merge_interval();
        int[][] merged = obj.merge(arr);

        System.out.println(Arrays.deepToString(merged));
    }
}
