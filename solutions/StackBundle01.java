package solutions;

import java.util.Stack;

public class StackBundle01 {

    public boolean isValidParentheses(String s) {
        String copen = "([{";
        String sclose = ")]}";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            int foundOpen = copen.indexOf(c);
            int foundClose = sclose.indexOf(c);
            if (foundOpen>-1) 
                stack.add(c);
            if (foundClose>-1) {
                if (stack.peek()==copen.charAt(foundClose))
                    stack.pop();
            }
        }
        return (stack.empty()? true:false);
    }    

}
