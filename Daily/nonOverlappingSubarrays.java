import java.util.HashMap;
import java.util.Arrays;

public class nonOverlappingSubarrays {

    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = Integer.MAX_VALUE / 2;
        int[] best = new int[n];

        Arrays.fill(best, INF);
        int[] prefix = new int[n + 1];

        for(int i = 0; i < n; i++){
            prefix[i + 1] = prefix[i] + arr[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        int answer = INF;

        for(int i = 1; i <= n; i++){
            best[i - 1] = (i >= 2)
                    ? best[i - 2]
                    : INF;

            int required = prefix[i] - target;

            if(map.containsKey(required)){
                int j = map.get(required);
                int length = i - j;

                if(j > 0 && best[j - 1] != INF){
                    answer = Math.min(
                        answer,
                        best[j - 1] + length
                    );
                }

                best[i - 1] = Math.min(
                    best[i - 1],
                    length
                );
            }

            map.put(prefix[i], i);
        }        

        return answer == INF ? -1 : answer;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,2,4,3};
        int k = 3;

        nonOverlappingSubarrays obj = new nonOverlappingSubarrays();
        System.out.println(obj.minSumOfLengths(arr, k));
    }
}
