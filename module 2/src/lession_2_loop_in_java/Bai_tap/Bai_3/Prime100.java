package lession_2_loop_in_java.Bai_tap.Bai_3;

import java.util.Scanner;

public class Prime100 {


    public static void main(String[] args) {
        int i=2;
        while (i <100){
            if (isPrime(i) ){
                System.out.println(i);
            }
            i++;
        }
    }
    private static boolean isPrime(int num) {
        boolean check = false;
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }return true;
}
}
