// 9

public class citations{

    public void sort(int[] nums){
        int size = nums.length;

        for(int i=0;i<size-1;i++){
            for(int j=0; j<size-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.print("After Sorting: ");
        for(int i=0;i<size;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public int hIndex(int[] citations) {

        sort(citations);

        int size = citations.length;
        System.out.println("Size: "+size);

        for(int i=0;i<size;i++){
            if(citations[i] >= size-i){
                return size-i;
            }
        }
        
        return 0;
    }

    public static void main(String[] args) {
        int[] cita = {3,0,6,1,5};
        // int[] cita = {1,3,1};
        citations obj = new citations();
        int c= obj.hIndex(cita);
        System.out.println("H-Index: "+c);
    }
}