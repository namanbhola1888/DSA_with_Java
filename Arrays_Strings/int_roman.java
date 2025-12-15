// 17

import java.util.HashMap;
import java.util.Map;

public class int_roman {
    public String intToRoman(int num) {
        String s = "";
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        return s;
    }
    
    public static void main(String[] args) {
        int num = 3;
        int_roman obj = new int_roman();
        String s = obj.intToRoman(num);
        System.out.println(s);
    }
}
