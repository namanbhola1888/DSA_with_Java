public class max_subarray{

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int current_max = nums[0];
        int maxsofar = nums[0];

        for(int i=1; i<n; i++){
            current_max = Math.max(nums[i], current_max + nums[i]);
            maxsofar = Math.max(current_max, maxsofar);
        }

        return maxsofar;    
    }

    public static void main(String[] args) {

        int[] nums = {5,4,-1,7,8};

        max_subarray obj = new max_subarray();
        System.out.println(obj.maxSubArray(nums));
    }
}