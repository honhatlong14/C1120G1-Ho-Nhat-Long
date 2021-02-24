package lession_1_introduction_to_java.bai_3;

import java.util.Scanner;

public class doi_tien_te {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap USD: ");
        int usd  = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.println("VND la :"+ vnd);
    }
}
