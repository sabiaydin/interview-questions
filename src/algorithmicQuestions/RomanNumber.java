package algorithmicQuestions;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public static int convertRomanToDecimal(String expression) {
        Map<Character,Integer> map =new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;
        for (int i = 0; i < expression.length(); i++) {
            int s1 = map.get(expression.charAt(i));
            if (i + 1 < expression.length()) {
                int s2 = map.get(expression.charAt(i + 1));
                if (s1 >= s2) {

                    result = result + s1;
                } else {
                    result = result + s2 - s1;
                    i++;
                }
            }
            else {
                result= result+s1;
            }
        }
        return result;
    }
}
