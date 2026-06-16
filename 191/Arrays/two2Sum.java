import java.util.HashMap;

public class two2Sum {

    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int fixed;

        for(int i=0; i<n; i++){
            fixed = target - nums[i];

            if(map.containsKey(fixed)){
                return new int[]{map.get(fixed), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        
        two2Sum obj = new two2Sum();
        int[] result = obj.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
