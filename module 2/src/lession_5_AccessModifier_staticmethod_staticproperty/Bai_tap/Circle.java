package lession_5_AccessModifier_staticmethod_staticproperty.Bai_tap;

public class Circle {
    private double radius =1.0;
    private String color ="red";
    Circle(){ //Constructor
    }
    Circle(double radius){//Constructor
        this.radius = radius;
    }
    public double getRadius(){//method
        return this.radius;//tra ve gia tri hien tai
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
