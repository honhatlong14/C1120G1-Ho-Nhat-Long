package lession_6_inheritance.Bai_tap.circle_cylinder;

public class CircleTest extends Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(4.5, "red");
        System.out.println(circle);
        System.out.println("dien tich la: " + circle.getArea());
        System.out.println("chu vi la: " + circle.getPerimeter());
    }
}
