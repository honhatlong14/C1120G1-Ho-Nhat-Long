package lession_6_inheritance.Bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height = 5.6;

    public Cylinder(){
    }
    public Cylinder(double height){
        this.height=height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.height*Math.PI* getRadius()*getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + '}' +
                "volume = " + getVolume()
               + super.toString();
    }
}
