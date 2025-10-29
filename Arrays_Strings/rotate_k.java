public class rotate_k {

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // k = k % n; 

        // Step 1: Reverse whole array
        reverse(nums, 0, n - 1);
         for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);
        for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);

        // Print result
        for (int val : nums) {
            System.out.print(val + " ");
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        rotate_k obj = new rotate_k();
        obj.rotate(nums,k);
    }
}
