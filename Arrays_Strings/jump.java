public class jump {

    public int max(int a,int b){
        return (a>b)? a:b;
    }

    public boolean canJump(int[] nums) {
        int maxreach = 0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            System.out.println("i: " + i);
            System.out.println(i + ". nums[i]: " + nums[i]);
            System.out.println("MaxReach: " + maxreach + " Element: " + nums[maxreach]);


            if (i > maxreach) {
                return false;
            }

            maxreach = max(maxreach, i + nums[i]);
            
            if(maxreach >=n-1){
                return true;
            }
            
            System.out.println();
        }
        return false;
    }

    public static void main(String[] args) {
        // int[] nums = {2,3,1,1,4};
        int[] nums = {3,2,1,0,4};
        jump obj = new jump();
        boolean c = obj.canJump(nums);
        System.out.println(c);
    }
}
