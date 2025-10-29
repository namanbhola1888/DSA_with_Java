// 11


public class product{

    public int[] productExceptSelf_n2(int[] nums) {
        System.out.println("O(n^2) time complexity");
        int[] product_self = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product = 1;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                product *= nums[j];
            }
            product_self[i] = product;
        }

        return product_self;
    }

    public int[] productExceptSelf_division_allowed(int[] nums){
        int product =1;
        int zeros =0;
        int idx =0;
        System.out.println("If Division is allowed");
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 0){
                zeros+=1;
                idx = i;
            }
            else{
                product *= nums[i];
            }
        }
        System.out.println("Product: " + product);

        int[] new_arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            new_arr[i] = 0;
        }

        if( zeros >1 ){
            return new_arr;
        }

        if (zeros == 0) {
            for (int i = 0; i < nums.length; i++) {
                new_arr[i] = product / nums[i];
            }
        }

        new_arr[idx] = product;
        
        return new_arr;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] new_arr = new int[nums.length];
        new_arr[0] = 1;
        int prefix_product =1;

        for(int i=1; i<nums.length;i++){
            prefix_product *= nums[i-1];
            new_arr[i] = prefix_product; 
        }

        int suffix_product =1;

        for(int i=new_arr.length-2; i>=0;i--){
            suffix_product *= nums[i+1];
            new_arr[i] *= suffix_product;
        }

        return new_arr;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        product obj = new product();
        nums = obj.productExceptSelf(nums);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }

    }
}