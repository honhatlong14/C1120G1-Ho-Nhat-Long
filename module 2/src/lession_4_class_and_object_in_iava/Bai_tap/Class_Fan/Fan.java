package lession_4_class_and_object_in_iava.Bai_tap.Class_Fan;

public class Fan {
    public final int SLOW = 1 ;
    public final int MEDIUM = 2;
    public final int FAST = 3;
        private int speed= SLOW;
        private boolean on = false;
        private double radius =5;
        private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (on){
            return "Color= "  + color + " radius = "+radius + " fan is off" ;
        }else {
            return "speed= " + speed + " color= " + color + " radius= "+ radius + " fan is on";
        }
    }

//    public String toString() {
//        return "Fan{" +
//                "SLOW=" + SLOW +
//                ", MEDIUM=" + MEDIUM +
//                ", FAST=" + FAST +
//                ", speed=" + speed +
//                ", on=" + on +
//                ", radius=" + radius +
//                ", color='" + color + '\'' +
//                '}';
//    }

    public static void main(String[] args) {
        Fan fan1 =new Fan(10,false,10,"yellow");
        Fan fan2 =new Fan(5,true,5,"blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
