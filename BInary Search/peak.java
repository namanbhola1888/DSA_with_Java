public class peak{
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        while(low<high){
            int mid = low+(high-low)/2;

            if(nums[mid] > nums[mid+1]){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        peak obj = new peak();

        System.out.println(obj.findPeakElement(arr));
    }
}