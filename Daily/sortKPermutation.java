public class sortKPermutation{
    public int sortPermutation(int[] nums) {
        int ans = -1;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] != i){
                ans &= nums[i];
            }
        }

        return ans == -1 ? 0 : ans;
    }

    void main(){
        int[] nums = {0,1,3,2};

        sortKPermutation obj = new sortKPermutation();
        System.out.println(obj.sortPermutation(nums));
    }
}