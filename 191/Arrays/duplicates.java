public class duplicates {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 1;
        for(int i=1; i<n; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};

        duplicates obj = new duplicates();
        System.out.println(obj.removeDuplicates(nums));
    }
}
