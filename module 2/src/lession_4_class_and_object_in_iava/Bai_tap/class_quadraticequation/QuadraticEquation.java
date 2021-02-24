package lession_4_class_and_object_in_iava.Bai_tap.class_quadraticequation;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    double delta;
    double r1;
    double r2;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getRoot1(){
        return this.r1= (-this.b+Math.sqrt(this.delta))/2*this.a;
    }
    public double getRoot2(){
        return this.r1= (-this.b-Math.sqrt(this.delta))/2*this.a;
    }
    public double getDiscriminant(){
        return delta= (this.b)*(this.b) - 4*(this.a*this.c);

    }
}
