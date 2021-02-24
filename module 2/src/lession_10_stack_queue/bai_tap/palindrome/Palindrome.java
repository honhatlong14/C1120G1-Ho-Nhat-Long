package lession_10_stack_queue.bai_tap.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter string");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            stack.push(temp);
            queue.add(temp);
        }
        boolean check = true;
        for (int i = 0; i < input.length(); i++) {
            if (stack.pop().equals(queue.poll())) {
            } else {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("is the chain of symmetry");
        } else System.out.println("is not a chain of symmetry");
    }
}
