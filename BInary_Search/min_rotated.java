public class min_rotated {

    public int findMin(int[] nums) {

        if(nums.length == 0) return 0;

        int low = 0;
        int high = nums.length-1;
        if(nums[low] <= nums[high]) return nums[low];

        while(low<high){
            int mid = low + (high-low)/2;

            if(nums[mid] <= nums[high]){
                high = mid;
            }
            else if(nums[mid] > nums[high]){
                low = mid + 1;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};

        min_rotated obj = new min_rotated();
        System.out.println(obj.findMin(arr));
    }    
}
