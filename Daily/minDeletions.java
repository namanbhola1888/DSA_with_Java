public class minDeletions {

    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int index_max = 0;
        int index_min = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] > max){
                max = nums[i];
                index_max = i;
            }     
            
            if(nums[i] < min){
                min = nums[i];
                index_min = i;
            }
        }

        int left = Math.min(index_min, index_max);
        int right = Math.max(index_min, index_max);

        int removefront = right+1;
        int removeback = n - left;
        int removebothsides = (left + 1) + (n - right);
        

        return Math.min(removefront, Math.min(removeback, removebothsides));
    }

    public static void main(String[] args){
        int[] nums = {2, 10, 7, 5, 4, 1, 8, 6};

        minDeletions obj = new minDeletions();
        System.out.println(obj.minimumDeletions(nums));
    }
}
