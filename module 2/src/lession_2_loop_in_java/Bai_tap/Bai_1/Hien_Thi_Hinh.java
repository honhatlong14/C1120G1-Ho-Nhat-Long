package lession_2_loop_in_java.Bai_tap.Bai_1;

import java.util.Scanner;

public class Hien_Thi_Hinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        while (true) {
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    function1();
                    break;
                case 2:
                    function2();
                    break;
                case 3:
                    function3();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }


    private static void function1() {
        for (int c = 1; c <= 4; c++) {
            for (int d = 1; d < 7; d++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }

    private static void function2() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("*");
            }System.out.println("*");
        }
    }

    private static void function3() {
        for (int a = 7; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}
