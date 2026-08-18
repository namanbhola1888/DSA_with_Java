import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;

public class almostMissing{
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<=n-k; i++){

            Set<Integer> seen = new HashSet<>();

            for(int j=i; j<i+k; j++){
                seen.add(nums[j]);
            }

            for(int x: seen){
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        int answer = -1;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                answer = Math.max(answer, entry.getKey());
            } 
        }

        return answer;
    }

    public static void main(String[] args){
        int[] nums = {3,9,2,1,7};
        int k = 3;

        almostMissing obj = new almostMissing();
        System.out.println(obj.largestInteger(nums, k));
    }
}