public class runLengthEncode {

    private String encode(String s){
        return "1";
    }

    public String countAndSay(int n) {
        String result = "1";

        for (int i = 2; i <= n; i++) {
            result = encode(result);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        runLengthEncode obj = new runLengthEncode();
        System.err.println(obj.countAndSay(n));
    }
}
