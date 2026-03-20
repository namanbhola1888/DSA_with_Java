public class circular_max {
    public int maxSubarraySumCircular(int[] nums) {

        int n = nums.length;
        int maxsofar = nums[0], minsofar = nums[0];
        int currentmax = nums[0], currentmin = nums[0];
        int totalsum = nums[0];
        

        for(int i=1; i< n; i++){

            totalsum = totalsum + nums[i];

            currentmax = Math.max(nums[i], currentmax + nums[i]);
            currentmin = Math.min(nums[i], currentmin + nums[i]);
            System.out.println("Currentmax: "+currentmax);
            System.out.println("currentmin: "+currentmin);

            maxsofar = Math.max(currentmax, maxsofar);
            minsofar = Math.min(currentmin, minsofar);
            System.out.println("Maxsofar: "+maxsofar);
            System.out.println("minsofar: "+minsofar);

            System.out.println("totalsum: "+ totalsum);
        }

        if(maxsofar < 0) return  maxsofar;

        return Math.max(maxsofar, totalsum-minsofar);
    }

    public static void main(String[] args){
        int[] nums = {5,-3,5};

        circular_max obj = new circular_max();
        System.out.println(obj.maxSubarraySumCircular(nums)); 
    }
}
