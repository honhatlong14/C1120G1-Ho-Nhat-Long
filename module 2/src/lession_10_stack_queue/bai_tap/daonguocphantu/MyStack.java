package lession_10_stack_queue.bai_tap.daonguocphantu;

import java.util.Arrays;
import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6,7,8,9};
        Stack<Integer> myStack = new Stack<>();
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
        for (int i = 0; i < array.length; i++) {
            myStack.push(array[i]);
        }
        for (int i = 0; i<array.length; i++){
            array[i] = myStack.pop();
        }
        System.out.println(Arrays.toString(array));
//        System.out.println(myStack.peek());



    }

}
