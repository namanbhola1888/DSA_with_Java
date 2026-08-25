import java.util.HashSet;

public class missingMultiple {

    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;

        for(int num: nums){
            set.add(num);
        }

        int multiple = k;
        while(set.contains(multiple)){
            multiple += k;
        }

        return multiple;
    }

    public static void main(String[] args) {
        int[] nums = {8,2,3,4,6};
        int k =2;

        missingMultiple obj = new missingMultiple();
        System.out.println(obj.missingMultiple(nums, k));
    }
}
