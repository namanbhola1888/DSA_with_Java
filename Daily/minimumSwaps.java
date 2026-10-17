import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class minimumSwaps{
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = sumDigits(nums[i]);
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        Map<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            pos.put(arr[i][0], i);
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || pos.get(nums[i]) == i) {
                continue;
            }

            int j = i;
            int cycleSize = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = pos.get(nums[j]);
                cycleSize++;
            }

            swaps += cycleSize - 1;
        }

        return swaps;
    }

    private int sumDigits(int x){
        int s = 0;

        for(; x>0; x/=10) s += x%10;

        return s;
    }

    public static void main(String[] args){
        int[] nums = {37, 101};

        minimumSwaps obj = new minimumSwaps();
        System.out.println(obj.minSwaps(nums));
    }
}