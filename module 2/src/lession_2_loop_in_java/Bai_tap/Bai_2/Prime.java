package lession_2_loop_in_java.Bai_tap.Bai_2;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("nhap so nguyen: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;

        for (int i = 2; count < num; i++ ){
            if (isPrime(i)){
                System.out.print(i+"\t");
                count++;
            }
        }
    }
}
