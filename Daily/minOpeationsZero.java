public class minOpeationsZero {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;

        for(int num: nums){
            total += num;
        }
        
        int target = total - x;
        if(target < 0) return -1;
        if(target == 0) return n;

        int left = 0;
        int sum = 0;
        int maxLen = -1;

        for(int right=0; right<n; right++){
            sum += nums[right];

            while(sum > target){
                sum -= nums[left];
                left++;
            }

            if(sum == target){
                maxLen = Math.max(maxLen, right-left+1);
            }
        }

        return maxLen == -1? -1: n-maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,4,2,3};
        int x = 5;

        minOpeationsZero obj = new minOpeationsZero();
        System.out.println(obj.minOperations(nums, x));
    }
}
