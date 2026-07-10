import java.util.HashMap;
import java.util.Stack;

public class nextGreater{

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<m; i++){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                int top = stack.pop();
                map.put(top, nums2[i]);
            }

            stack.push(nums2[i]);
        }

        // for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }

        while(!stack.isEmpty()){
            int top = stack.pop();
            map.put(top, -1);
        }

        for(int i=0; i<n; i++){
            result[i] = map.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        nextGreater obj = new nextGreater();
        int[] result = obj.nextGreaterElement(nums1, nums2);

        for(int num: result){
            System.out.print(num + " ");
        }
    }
}