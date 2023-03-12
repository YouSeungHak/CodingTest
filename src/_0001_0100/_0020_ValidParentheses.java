package _0001_0100;

import java.util.Stack;

public class _0020_ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1)
            return false;

        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i+1);
            if(str.equals("(") || str.equals("{") || str.equals("[")) {
                stack.push(str);
                continue;
            }

            if(stack.size() == 0)
                return false;

            String popStr = stack.pop();
            if(str.equals(")") && !popStr.equals("(")) {
                return false;
            } else if(str.equals("}") && !popStr.equals("{")) {
                return false;
            } else if(str.equals("]") && !popStr.equals("[")) {
                return false;
            }
        }

        if(stack.size() != 0)
            return false;

        return true;
    }
}
