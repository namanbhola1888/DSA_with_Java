public class merge{

    public static void merging(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j=n-1;
        int k=(m+n)-1;

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        for (int val : nums1) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args){
        int n=3;
        int m=3;
        int[] a1 = {1,2,3,0,0,0};
        int[] a2 = {2,4,5};

        merging(a1,m,a2,n);

    }
}