package lession_10_stack_queue.bai_tap.kiemtradaungoac;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        System.out.println(check("()"));
    }
    public static boolean check(String str) {
        if (str.isEmpty())
            return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(') {
                stack.push(sym);
            }
            if (sym == ')') {
                if (stack.isEmpty())
                    return false;
                char left = stack.peek();
                if (sym == ')' && left == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


