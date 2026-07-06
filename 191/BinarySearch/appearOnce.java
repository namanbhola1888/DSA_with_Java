public class appearOnce {

    public int singleNonDuplicate(int[] nums) {

        int low = 0;
        int high = nums.length-1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(mid %2 == 0){
                if(nums[mid] == nums[mid+1]){
                    low  = mid + 2;
                }
                else{
                    high = mid;
                }

            }
            else{
                if(nums[mid] == nums[mid-1]){
                    low = mid +1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4,5,5};
        appearOnce obj = new appearOnce();
        
        System.out.println(obj.singleNonDuplicate(nums));
    }
}
