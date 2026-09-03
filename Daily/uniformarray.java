public class uniformarray {

    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;

        for(int num: nums1){
            min = Math.min(min, num);
        }

        int minParity = min % 2;

        for(int num: nums1){
            if(num % 2 == minParity) continue;

            if((num - min) % 2 != minParity) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,7};

        uniformarray obj = new uniformarray();
        System.out.println(obj.uniformArray(arr));
    }   
}
