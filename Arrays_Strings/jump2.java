public class jump2 {

    public int max(int a,int b){
        return (a>b)? a:b;
    }

    public int jump(int[] nums) {
        int maxreach = 0;
        int n= nums.length;
        int currentend=0;
        int jumps = 0;
        for(int i=0;i<n-1;i++){
            System.out.println("i: " + i);
            System.out.println(i + ". nums[i]: " + nums[i]);
            System.out.println("MaxReach: " + maxreach + " Element: " + nums[maxreach]);

            maxreach = max(maxreach, i + nums[i]);
            if(i==currentend){
                jumps++;
                currentend = maxreach;
            }
            System.out.println();
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        // int[] nums = {3,2,1,0,4};
        jump2 obj = new jump2();
        int c = obj.jump(nums);
        System.out.println("Maximum Jumps: "+c);
    }
}
