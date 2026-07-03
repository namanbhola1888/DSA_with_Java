public class consecutive{

    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0;
        int count = 0;

        for(int num: nums){
            if(num == 1){
                count++;
                max_count = Math.max(max_count, count);
            }
            else{
                count = 0;
            }
        }

        return max_count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};

        consecutive obj = new consecutive();
        System.out.println(obj.findMaxConsecutiveOnes(arr));
    }
}