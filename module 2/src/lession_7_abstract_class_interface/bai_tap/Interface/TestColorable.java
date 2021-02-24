package lession_7_abstract_class_interface.bai_tap.Interface;

import lession_7_abstract_class_interface.bai_tap.resizeable.Circle;
import lession_7_abstract_class_interface.bai_tap.resizeable.Rectangle;
import lession_7_abstract_class_interface.bai_tap.resizeable.Shape;
import lession_7_abstract_class_interface.bai_tap.resizeable.Square;


public class TestColorable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0]= new Circle(2.0);
        shape[1]= new Rectangle(2.3,5,"red",false);
        shape[2]= new Square(12,"pink",false);
        for (Shape value : shape) {
            if (value instanceof Colorable) {
                Square square = new Square();
                square.howToColor();
            }
            System.out.println(value.getArea());
        }
    }
}
