import java.util.HashSet;

public class prefixSum{

    public int missingInteger(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int sum = nums[0];

        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1] + 1){
                sum += nums[i];
            }
            else{
                break;
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int x = sum;
        while(set.contains(x)){
            x++;
        }

        return x;
    }

    public static void main(String[] args){
        int[] arr = {3,4,5,1,12,14,13};

        prefixSum obj = new prefixSum();
        System.out.println(obj.missingInteger(arr));
    } 
}