public class most_water {

    public int maxArea(int[] height) {
        int left =0,right=height.length-1;
        int maxarea=0, area=0;


        while(left<right){

            System.out.println("Left: " + left + " Right: " + right);
            System.out.println("Height Left: " + height[left] + " Height Right: " + height[right]);

            area = (right-left) * Math.min(height[left], height[right]);
            maxarea = Math.max(maxarea,area);
            System.out.println("MaxArea: "+ maxarea);
            System.out.println("Area: "+ area);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxarea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        most_water obj = new most_water();
        int c = obj.maxArea(height);
        System.out.println("MaxArea: " +c);
    }
}
