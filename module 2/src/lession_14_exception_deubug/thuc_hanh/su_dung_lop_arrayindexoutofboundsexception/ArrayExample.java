package lession_14_exception_deubug.thuc_hanh.su_dung_lop_arrayindexoutofboundsexception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer [] arr = new Integer[100];
        System.out.println("Danh Sach Cac Phan Tu Cua Mang: ");
        for (int i = 0; i <100 ; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n vui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("giá trị của phần tử có chỉ số "+ x + " là: " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng: ");
        }
    }
}
