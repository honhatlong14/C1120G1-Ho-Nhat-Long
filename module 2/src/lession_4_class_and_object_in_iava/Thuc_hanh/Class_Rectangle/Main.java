package lession_4_class_and_object_in_iava.Thuc_hanh.Class_Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
    }
}
