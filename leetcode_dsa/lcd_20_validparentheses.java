/*
Problem : 
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */

import java.util.Stack;

public class lcd_20_validparentheses {
    public boolean isValid(String exp) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                if (stack.empty()) {
                    return false;
                }
                Character top = stack.pop();
                if ((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}

