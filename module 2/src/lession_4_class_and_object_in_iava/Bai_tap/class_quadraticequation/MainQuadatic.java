package lession_4_class_and_object_in_iava.Bai_tap.class_quadraticequation;

import java.util.Scanner;

public class MainQuadatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        System.out.println(a+"x^2+"+b+"x+"+c+"=0");
        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("phuong trinh vo so nghiem");
                }else {
                    System.out.println("PTVN");
                }
            }else {
                System.out.println("phuong trinh co 1 nghiem:"+ (-c/b));
            }
        }else {
            QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
            double delta = quadraticEquation.getDiscriminant();
   //         System.out.println(delta);
            if (delta<0)
                System.out.println("Phuong trinh vo nghiem");
            else if(delta==0){
                double x1 = quadraticEquation.getRoot1();
                System.out.println("Phuong trinh co nghiem kep: "+ x1);
            }else{
                double x1 = quadraticEquation.getRoot1();
                double x2 = quadraticEquation.getRoot2();
                System.out.println("Phuong rinh co  nghiem: " + x1 +" , "+x2);
            }
      }

    }
}
