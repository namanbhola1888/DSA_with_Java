import java.util.HashMap;

public class two_sum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        int fixed;
        for(int i=0; i<n; i++){
            fixed = target - nums[i];
            if(map.containsKey(fixed)){
                return new int[]{map.get(fixed), i};
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        two_sum obj = new two_sum();
        int[] output = obj.twoSum(arr, target);
        for(int i=0; i<output.length; i++){
            System.out.print(output[i] + " ");
        }

    }
}
