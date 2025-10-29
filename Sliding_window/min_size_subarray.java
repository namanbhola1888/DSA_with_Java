
public class min_size_subarray {

    public int minSubArrayLen(int target, int[] nums) {
        int left= 0, sum=0;
        int minlen = Integer.MAX_VALUE;

        for(int right=0; right<nums.length; right++){
            sum+= nums[right];
            while(sum >= target){
                minlen = Math.min(minlen, right-left+1);
                sum -= nums[left];
                left++;
            }
        }

        return (minlen == Integer.MAX_VALUE) ? 0 : minlen;
    }

    public static void main(String[] args) {

        int[] nums = {2,3,1,2,4,3};
        int target = 7;

        min_size_subarray obj = new min_size_subarray();
        int c = obj.minSubArrayLen(target, nums);
        System.out.println(c);
    }  
}
