package Question_13_Roman_to_integer;

import java.util.HashMap;

/**
 * Created by bbuy on 7/14/18.
 */
public class code {
    public static void main(String []args) {
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        // I am assuming that all the input is legit. Meaning for example I can only come after or before itself or V or X.
        // Start from the first letter (i) and check the letter come after (i). If smaller or equal then we minus (i) from sum, otherwise, add.

        HashMap<Character, Integer> valueLookup = new HashMap<>();
        valueLookup.put('I',1);
        valueLookup.put('V',5);
        valueLookup.put('X',10);
        valueLookup.put('L',50);
        valueLookup.put('C',100);
        valueLookup.put('D',500);
        valueLookup.put('M',1000);


        int sum = 0;
        for (int i =0; i<s.length(); i++) {
            int itemValue = valueLookup.get(s.charAt(i));
            int addon = itemValue;
            while (i+1<s.length() && s.charAt(i) == s.charAt(i+1)) {
                addon += itemValue;
                i++;
            }
            if (i+1<s.length() && itemValue <valueLookup.get(s.charAt(i+1))) {
                sum -= addon;
            } else {
                sum += addon;
            }
        }

        return sum;
    }
}
