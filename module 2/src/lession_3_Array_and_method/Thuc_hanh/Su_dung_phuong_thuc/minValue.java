package lession_3_Array_and_method.Thuc_hanh.Su_dung_phuong_thuc;

import java.util.Scanner;

public class minValue {
    public static int minValue(int[] array) {
        int min=array[0];
        int n = -1;
        for (int i = 0; i < array.length; i++) {
            if (min>array[i] ) {
                min = array[i];
                n = i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}
