// 15

public class candies {

    public int candy(int[] ratings) {
        int candy_count=0;
        int n = ratings.length;
        int[] candi = new int[n];
        candi[0] = 1;

        for(int i=1;i<n;i++){
            if(ratings[i] > ratings[i-1]){
                candi[i] = candi[i-1] +1;
            }
            else{
                candi[i] = 1;
            }
        }

        for(int i=n-2; i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                candi[i] = Math.max(candi[i], candi[i+1] + 1);
            }
        }

        for(int c:candi) candy_count+=c;

        return candy_count;
    }

    public static void main(String[] args) {
        int[] ratings = {1,2,87,87,87,2,1};
        candies obj = new candies();
        int c  = obj.candy(ratings);
        System.out.println(c);
    }
}
