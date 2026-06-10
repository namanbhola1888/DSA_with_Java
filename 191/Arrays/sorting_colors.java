public class sorting_colors {

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};

        sorting_colors obj = new sorting_colors();
        obj.sortColors(nums);
    }
}
