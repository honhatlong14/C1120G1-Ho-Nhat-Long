package lession_14_exception_deubug.bai_tap.su_dung_lop_illegaltriangleexception;

import java.util.Scanner;

public class IllegalTriangleException extends Exception{
    IllegalTriangleException(){
        super("day ko phai la tam giac");
    }
    IllegalTriangleException(String msg){
        super(msg);
    }


}
