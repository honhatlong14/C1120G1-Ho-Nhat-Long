package lession_7_abstract_class_interface.bai_tap.resizeable;

import lession_7_abstract_class_interface.bai_tap.Interface.Colorable;

public class Square extends Rectangle implements Colorable {
    private double side = 2.0;


    public Square(){
    }
    public Square (double side, String color, boolean filled){
        super(side,side,color,false);
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}

