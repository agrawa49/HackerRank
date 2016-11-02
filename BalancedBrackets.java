import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean isBalanced(String expression) {
        Stack s = new Stack();
        for (int i = 0; i < expression.length(); ++i) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[')
                s.push(expression.charAt(i));
            else if (expression.charAt(i) == ')') {
                if (s.isEmpty())
                    return false;
                char c = (char) s.pop();
                if (c != '(')
                    return false;
            }
            else if (expression.charAt(i) == ']') {
                if (s.isEmpty())
                    return false;
                char c = (char) s.pop();
                if (c != '[')
                    return false;
            }
            else if (expression.charAt(i) == '}') {
                if (s.isEmpty())
                    return false;
                char c = (char) s.pop();
                if (c != '{')
                    return false;
            }
        }
        if (!s.isEmpty())
            return false;
        return true;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
