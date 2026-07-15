
public class romanToInteger{

    //   Symbol       Value
    //   I             1
    //   V             5
    //   X             10
    //   L             50
    //   C             100
    //   D             500
    //   M             1000
    
    private int value(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public int romanToInt(String s) {

        int n = s.length();
        int number = 0;
        int prev = 0;

        for(int i=n-1; i>=0; i--){
            char c = s.charAt(i);
            int curr = value(c);

            if(curr < prev){
                number -= curr;
            }
            else{
                number += curr;
            }
            
            prev = curr;
        }
        
        return number;
    }

    public static void main(String[] args){
        String s = "LVIII";
        romanToInteger obj = new romanToInteger();

        System.err.println(obj.romanToInt(s));
    }
}