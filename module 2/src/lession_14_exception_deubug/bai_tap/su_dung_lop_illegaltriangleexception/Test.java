package lession_14_exception_deubug.bai_tap.su_dung_lop_illegaltriangleexception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh a: ");
        int a = scanner.nextInt();
        System.out.println("nhap canh b: ");
        int b = scanner.nextInt();
        System.out.println("nhap canh c: ");
        int c = scanner.nextInt();

        try {
            Triangle triangle = new Triangle(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
