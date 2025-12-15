import java.util.HashMap;

public class majority{

    public int majorityElement(int[] nums) {
        int max=0;
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){  
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }

            for(int key: map.keySet()){
                if(map.get(key) > n/2){
                    max = key;
                }
            }
        }

        System.out.println(map);

        return max;
    }

    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        majority obj = new majority();
        int c = obj.majorityElement(nums);
        System.out.println(c);
    }
}