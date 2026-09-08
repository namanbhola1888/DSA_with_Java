public class commas {

    public int countCommas(int n) {
        
        if(n < 1000){
            return 0;
        }

        return n - 1000 + 1;
    }

    public static void main(String[] args) {
        int n = 1002;
        commas obj = new commas();
        
        System.out.println(obj.countCommas(n));
    }
}
