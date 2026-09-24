public class digitSumToIndex {
    public int smallestIndex(int[] nums) {
        int n = nums.length;

        for(int i=0; i<n; i++){
            int sum = 0;
            int num = nums[i];

            while(num > 0){
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }

            if(sum == i){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2};
        
        digitSumToIndex obj = new digitSumToIndex();
        System.out.println(obj.smallestIndex(nums));
    }
}
