public class medianArray{

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        double result = 0;

        int[] merged = new int[n+m];
        int k = 0;
        int i = 0;
        int j = 0;

        while(i<n && j<m){
            if(nums1[i] < nums2[j]){
                merged[k++] = nums1[i++];
            }
            else{
                merged[k++] = nums2[j++];
            }
        }
        
        while(i < n){
            merged[k++] = nums1[i++];
        }
        
        while(j < m){
            merged[k++] = nums2[j++];
        }

        if(merged.length %2 == 0){
            result = (merged[merged.length / 2 -1] + merged[merged.length/2]) / 2.0;
        }
        else{
            result = merged[merged.length / 2];
        }
        
        return result;
    }

    public static void main(String[] args){
        int[] arr1 = {1,3};
        int[] arr2 = {2};

        medianArray obj = new medianArray();
        System.out.println(obj.findMedianSortedArrays(arr1, arr2));
    }
}