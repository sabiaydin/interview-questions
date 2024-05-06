package algorithmicQuestions;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToDecimal {
    public static int convertRomanToDecimal2(String expression) {
        Map<Character,Integer> map =new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
int length=expression.length();
int result = map.get(expression.charAt(length-1));
for(int i=length-2;i>=0;i--){
    if (map.get(expression.charAt(i)) >= map.get(expression.charAt(i + 1)))
        result+=map.get(expression.charAt(i));
    else
      result-=map.get(expression.charAt(i));

}
        System.out.println("Integer: " + result);
        System.out.println("------------------------------------");
        return result;

}}
