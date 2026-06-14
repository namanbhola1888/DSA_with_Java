import java.util.HashMap;
import java.util.Map;

public class majority {

    // public int majorityElement(int[] nums) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     int n = nums.length;

    //     for(int i=0; i<n; i++){
    //         map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    //     }
        
    //     for(int key: map.keySet()){
    //         if(map.get(key) > n/2){
    //             return key;
    //         }
    //     }

    //     return -1;
    // }


    // Using Boyer-Moore Voting Algo
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};

        majority obj = new majority();
        System.out.println(obj.majorityElement(nums));
    }
}
