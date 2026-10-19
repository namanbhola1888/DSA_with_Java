import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class targetIndicesList{
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            if(nums[i] == target) result.add(i);
        }

        return result;
    }

    void main(){
        int[] nums = {1,2,5,2,3};
        int target = 2;

        targetIndicesList obj = new targetIndicesList();
        List<Integer> result = obj.targetIndices(nums, target);
        System.out.println(result);
    }
}