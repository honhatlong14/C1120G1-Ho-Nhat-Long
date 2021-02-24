package lession_7_abstract_class_interface.bai_tap.resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Circle circle = new Circle(10,"red",false);
        System.out.println(circle.getArea());
        System.out.println(circle.toString());
        circle.resize(50);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        
        Rectangle rectangle =new Rectangle(11,12,"pink",false);
        System.out.println(rectangle);
        rectangle.resize1(50);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

    }
}
