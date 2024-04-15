package algorithmicQuestions;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Methods {
    public static boolean isPalindrome(Integer num) {
        int temp = num;
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        if (reverse == temp) {
            return true;
        }
        return false;
    }

    public static boolean isBalanced(String symbol) {
        Stack<Character> characterStack = new Stack<>();
        char ch;
        for (int i = 0; i < symbol.length(); i++) {
            ch = symbol.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                characterStack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (characterStack.isEmpty()) {
                    return false;
                }
                char top = characterStack.pop();
                if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{') {
                    return false;
                }
            }

        }
        return characterStack.isEmpty();
    }

    public static Set<Integer> findIndexes(int[] arr) {
        Set<Integer> index = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i!=j && arr[i] + arr[j] == 13) {
                    index.add(i);
                    index.add(j);
                }
            }

        }
        return index;
    }
    public static void displayIndexesWithSum(Set<Integer> indexes,int[] array) {
        Integer[] arr = indexes.toArray(new Integer[indexes.size()]);
        for (int i : arr) {
            for (int j : arr) {
                if (j>i)
                    if (array[i] + array[j] == 13) {
                        System.out.println(i+"+"+j+"="+(i+j));
                    }
            }
        }
    }
}

