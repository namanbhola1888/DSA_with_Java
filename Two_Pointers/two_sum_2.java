public class two_sum_2{

    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right = numbers.length-1;
        
        while(left< right){
            int sum = numbers[left] + numbers[right];
            
            if(sum == target){
                return new int[] {left+1, right+1};
            } 
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args){
        int[] arr = {2,3,4};
        int target = 6;
        two_sum_2 obj = new two_sum_2();
        int[] c = obj.twoSum(arr,target);
        
        for(int i=0;i<2;i++){
            System.out.print(c[i] + " ");
        }
    }
}