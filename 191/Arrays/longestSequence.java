
import java.util.HashSet;

public class longestSequence {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int n = nums.length;

        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }

        int longest = 0;
        int curr;

        for(int num: set){
            if(!set.contains(num - 1)){
                curr = num;
                int streak = 1;

                while(set.contains(curr + 1)){
                    curr++;
                    streak++;
                }
                longest = Math.max(longest, streak);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        
        int[] nums = {100,4,200,1,3,2};
        longestSequence obj = new longestSequence();
        
        System.out.println(obj.longestConsecutive(nums));
    }
}
