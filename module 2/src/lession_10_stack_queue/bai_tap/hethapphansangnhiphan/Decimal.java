package lession_10_stack_queue.bai_tap.hethapphansangnhiphan;

import java.util.Scanner;
import java.util.Stack;

public class Decimal {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        System.out.println(stack);
        System.out.println();
        String binary = "";
        int length = stack.size();
        for (int i = 0; i < length; i++) {
            binary += stack.pop();
        }
        System.out.println(binary);
    }
//        System.out.println("Enter a number: ");
//        Scanner scanner = new Scanner(System.in);
//        Stack<Integer> stack = new Stack<>();
//        int num = 118;
//        do {
//            stack.push(num %2);
//            num = num/2;
//        } while (num>0);
//        System.out.println(stack);
//
//        String binary = "";
//        int length= stack.size();
//        for (int i=0; i<length;i++){
//            binary += stack.pop();
//        }
////        while (!stack.isEmpty()){
////            binary += stack.pop();
////        }
//        System.out.println(binary);
////        int num = 118;
//////        Scanner scanner = new Scanner(System.in);
//////        System.out.println("enter decimal: ");
////        while (num !=0){
////            int d = num %2;
////            stack.push(d);
////            num/=2;
////        }
////        String binary = "";
////        while (!stack.isEmpty()){
////            binary += stack.pop();
////        }
////        System.out.println(binary);

}
