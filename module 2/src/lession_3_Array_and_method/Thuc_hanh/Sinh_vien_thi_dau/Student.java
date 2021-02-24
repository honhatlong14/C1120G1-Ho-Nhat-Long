package lession_3_Array_and_method.Thuc_hanh.Sinh_vien_thi_dau;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int [] array;
        do {
            System.out.println("Enter size: ");
            size = sc.nextInt();
            if (size>30){
                System.out.println("Size should not exceed 30");
            }
        }while (size>30);
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("Enter a mark for student " + (i + 1) + ": ");
            array[i]= sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("list of mark");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
