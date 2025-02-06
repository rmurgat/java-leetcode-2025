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

    public Stack<Integer> getMonotonicIncreasingStack(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<nums.length; i++) {
            while (!stack.empty() && stack.peek()>nums[i]) 
                stack.pop();
            stack.push(nums[i]);
        }
        return stack;
    }

    public Stack<Integer> getMonotonicDecreasingStack(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<nums.length; i++) {
            while (!stack.empty() && stack.peek()<nums[i]) 
                stack.pop();
            stack.push(nums[i]);
        }
        return stack;
    }

    public void printingIntegerStack(Stack<Integer> stack) {
        System.out.print(" top -> [");
        while(!stack.empty()) {
            Integer val = stack.pop();
            System.out.print(val + ", ");
        }
        System.out.println("]");
    }

}
