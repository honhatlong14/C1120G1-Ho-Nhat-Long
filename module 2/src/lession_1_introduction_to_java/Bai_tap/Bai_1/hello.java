package lession_1_introduction_to_java.Bai_tap.Bai_1;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("hello " + name);
    }
}
