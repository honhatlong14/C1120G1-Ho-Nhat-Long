package lession_1_introduction_to_java.Thuc_hanh.Giai_phuong_trinh_bac_1;

import java.util.Scanner;

public class class_nam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("a: ");
        a = sc.nextDouble();
        System.out.println("b:");
        b =sc.nextDouble();
        System.out.println("c: ");
        c = sc.nextDouble();
        if(a!= 0){
            double answer = (c - b)/a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }else {
            if (b==0){
                System.out.println("The solution all x!");
            }else {
                System.out.println("No solution!");
            }
        }

    }
}
