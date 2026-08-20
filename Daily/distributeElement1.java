import java.util.List;
import java.util.ArrayList;

public class distributeElement1 {

    public int[] resultArray(int[] nums) {
        int n = nums.length;

        List<Integer> arr1 = new ArrayList<>();   
        List<Integer> arr2 = new ArrayList<>();   
        int[] result = new int[n];

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2; i<n; i++){
            if(arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }

        int index = 0;
        for(int x: arr1){
            result[index++] = x;
        }

        for(int x: arr2){
            result[index++] = x;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,3,8};
        
        distributeElement1 obj = new distributeElement1();
        int[] result = obj.resultArray(nums);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
