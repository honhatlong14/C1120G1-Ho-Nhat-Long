package lession_6_inheritance.Bai_tap.point_moveablepint;

public class MoveAbleTest {
    public static void main(String[] args) {
        MoveAblePoint moveAblePoint = new MoveAblePoint();
        System.out.println(moveAblePoint.toString());

        moveAblePoint.setXY(3.0f, 4.0f);
        moveAblePoint.setSpeed(4.0f,5.0f);
        System.out.println(moveAblePoint);
//        moveAblePoint.setXY();
        moveAblePoint.move();
        System.out.println(moveAblePoint.toString());

        moveAblePoint.move();
        System.out.println(moveAblePoint.toString());
    }
}
