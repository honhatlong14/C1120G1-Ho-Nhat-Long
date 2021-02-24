package lession_6_inheritance.Bai_tap.circle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(6.7,"red",7.7 );
        System.out.println(cylinder);
        System.out.println("Volume = " + cylinder.getVolume());
    }
}
