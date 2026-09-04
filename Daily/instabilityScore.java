public class instabilityScore {

    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;

        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];

        for(int i=n - 2; i>=0; i--){
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);

            if((max - suffixMin[i]) <= k){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5,0,1,4};
        int k = 3;

        instabilityScore obj = new instabilityScore();
        System.out.println(obj.firstStableIndex(nums, k));
    }
}
