// 16

import java.util.HashMap;
import java.util.Map;


// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000


public class roman_int {

    public int romanToInt(String s) {
        int number=0;
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

        int prev =0;
        for(int i= s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            System.out.println("Char: " + c);

            int value = map.get(c);
            System.out.println("Value: " + value);

            if(value < prev){
                System.out.println("Value: "+ value + " Prev: " + prev);
                System.out.println("Number - Value =  " +number + " - " + " "+ value + " = "+(number-value));
                number -= value;
            }
            else{
                System.out.println("Number + Value =  " +number + " +  " + " "+ value + " = "+(number+value));
                number += value;
            }
            System.out.println("Prev = " + value);
            prev = value;
        }

        return number;
    }

    public static void main(String[] args) {
        String s = "III";
        roman_int obj = new roman_int();
        int c = obj.romanToInt(s);
        System.out.println(c);
    }    
}
