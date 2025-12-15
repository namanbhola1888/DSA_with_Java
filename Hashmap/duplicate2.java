import java.util.HashMap;

public class duplicate2{

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                if(Math.abs( i - (map.get(nums[i]))) <= k){
                    System.out.println(map);
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        
        System.out.println(map);
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,0,1,1};
        int k = 1;
        duplicate2 obj = new duplicate2();
        System.out.println(obj.containsNearbyDuplicate(nums,k));
    }
}