package lession_6_inheritance.Bai_tap.point_moveablepint;

import java.util.Arrays;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint(){
    }
    public MoveAblePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed(){
        float [] array1 = {getxSpeed(),getySpeed()};
        return array1;
    }
    public MoveAblePoint move(){  //
       setX(getX() + getxSpeed());
       setY(getY() + getySpeed());
        return this;
    }

    @Override
    public String toString() {
//        return "("+getX()+","+ getY()+"),"+ "speed = (" + xSpeed + "," + ySpeed +")";
        return super.toString()
                +"speed is: "+
                Arrays.toString(getSpeed());
    }
}
