package lession_14_exception_deubug.bai_tap.su_dung_lop_illegaltriangleexception;

import java.util.Scanner;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;
    public Triangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <=0 || side1 +side2 <side3 || side1 + side3< side2 ||side2 +side3 <side1 || side3<=0 || side2<=0 ){
            throw new IllegalTriangleException();
        }else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

    }
}
