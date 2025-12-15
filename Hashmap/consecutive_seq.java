import java.util.HashSet;

public class consecutive_seq {

    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        int longest=0;
        int curr;

        for(int num: set){
            if(!set.contains(num - 1)){
                curr = num;
                int streak = 1;
                
                while(set.contains(curr + 1)){
                    curr++ ;
                    streak++;
                }
                longest = Math.max(longest, streak);
            }
        }
        
        return longest;
    }

    public static void main(String[] args) {
        consecutive_seq obj = new consecutive_seq();
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(obj.longestConsecutive(arr));
    }
}
