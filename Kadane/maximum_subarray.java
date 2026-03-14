public class maximum_subarray{

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxsofar = nums[0];
        int currentmax = nums[0];
        
        for(int i=1; i<n; i++){
            currentmax = Math.max(nums[i], currentmax + nums[i]);
            maxsofar = Math.max(maxsofar, currentmax);
        }
        
        return maxsofar;
    }


    public static void main(String[] args) {
        // int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {1};
        maximum_subarray obj = new maximum_subarray();
        System.out.println(obj.maxSubArray(nums));   
    }
}