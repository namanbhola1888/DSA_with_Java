public class remove{

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int end= n-1;
        int i=0;
        
        while(i<=end){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
            else{
                i++;
            }
        }
        
        for(int nu : nums){
            System.out.print(nu + " ");
        }
        System.out.println();

        return end+1;
    }

    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        remove obj = new remove();
        int c = obj.removeElement(nums, val);
        System.out.println(c);
    }
}