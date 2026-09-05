public class instabilityScore2 {

    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        int[] suffixMin = new int[n];
        suffixMin[n-1] = nums[n-1];

        for(int i=n-2; i>=0; i--){
            suffixMin[i] = Math.min(suffixMin[i+1], nums[i]);
        }

        for(int i=0; i<n; i++){
            max = Math.max(nums[i], max);

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
