public class dup1 {
    // public int removeDuplicates(int[] nums) {
    //     int count=1;
    //     int i=0;
    //     int end = nums.length-1;

    //     while(i<end){
    //         if(nums[i] != nums[i+1]){
    //             count++;
    //         }

    //         while(nums[i] == nums[i+1]){
    //             int j= i;
    //             while(j<end){
    //                 nums[j] = nums[j+1];
    //                 j++;
    //             }
    //             nums[end] = nums[i];
    //         }
            
    //         i++;
    //     }

    //     for(int val: nums){
    //         System.out.print(val +" ");
    //     }
    //     System.out.println();

    //     return count;
    // }


    public int removeDuplicates(int[] nums) {
        int k=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }

        for(int val: nums){
            System.out.print(val +" ");
        }
        System.out.println();
        return k;    
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        dup1 obj = new dup1();
        int c = obj.removeDuplicates(arr);
        System.out.println(c);
    }
}
