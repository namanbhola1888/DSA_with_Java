public class first_and_last{

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if(nums.length == 0) return result;

        int low = 0;
        int high = nums.length-1;
        int occurance = -1;

        while(low<=high){
            int mid = low + (high-low) / 2;
            if(nums[mid] == target){
                occurance = mid;
                high = mid-1;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        result[0] = occurance;

        low = 0;
        high = nums.length-1;
        int occurance_2 = -1;

        while(low<=high){
            int mid = low + (high-low) / 2;
            if(nums[mid] == target){
                occurance_2 = mid;
                low = mid+1;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        result[1] = occurance_2;

        return result;
    }

    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        
        first_and_last obj = new first_and_last();
        int[] result = obj.searchRange(arr, target);

        for(int i: result){
            System.out.print(i + " ");
        }
    }
}