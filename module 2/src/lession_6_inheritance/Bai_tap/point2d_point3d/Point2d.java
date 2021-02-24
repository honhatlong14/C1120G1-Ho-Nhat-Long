package lession_6_inheritance.Bai_tap.point2d_point3d;

public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2d(){
    }
    public Point2d(float x, float y){
        this.x =x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float [] array = {this.x,this.y};
        return array;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
