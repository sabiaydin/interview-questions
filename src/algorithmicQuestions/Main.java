package algorithmicQuestions;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(Methods.isPalindrome(1223));

        System.out.println(Methods.isBalanced("((({]]))"));
        System.out.println(RomanNumber.convertRomanToDecimal("IV"));
        int[] arr = {2, 5, 3, 7, 6, 9, 10,11};
        Set<Integer> indexes=Methods.findIndexes(arr);
      Methods.displayIndexesWithSum(indexes,arr);
    }
    }