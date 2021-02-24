package lession_2_loop_in_java.Thuc_hanh.Ung_dung_tinh_tien_lai_cho_vay;

import java.util.Scanner;

public class Tien_Lai {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment money: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of month: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage");
        interset_rate = scanner.nextDouble();
        double total = 0;
        for (int i = 0; i<month;i++){
            total += money * (interset_rate/100)/12 * 3;
        }
        System.out.println("total: " + total);
    }
}
