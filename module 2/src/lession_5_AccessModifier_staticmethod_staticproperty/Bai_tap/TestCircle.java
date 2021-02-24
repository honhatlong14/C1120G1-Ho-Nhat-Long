package lession_5_AccessModifier_staticmethod_staticproperty.Bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();//khoi tao doi tuong
        Circle circle1 = new Circle(3.5);//khoi tao doi tuong
        //goi phuong thuc getArea cua doi tuong Circle
        System.out.println(circle.getArea() + "1.");
        System.out.println(circle.getRadius() + " 2.");
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

    }
}
