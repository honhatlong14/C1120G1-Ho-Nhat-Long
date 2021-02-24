package lession_3_Array_and_method.Bai_tap.Gop_array;

import java.util.Arrays;
import java.util.Scanner;

public class Araay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_1[] = new int[3];
        int arr_2[] = new int[4];
        int arr_3[] = new int[arr_1.length + arr_2.length];

        for (int i = 0; i < arr_1.length; i++) {
            System.out.println("enter element: arr[" + i + "]");
            arr_1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr_2.length; i++) {
            System.out.println("enter element: arr1[" + i + "]");
            arr_2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr_1));
        System.out.println(Arrays.toString(arr_2));
        for (int i = 0; i < arr_1.length; i++) {
            arr_3[i] = arr_1[i];
        }
        int k = 0;
        for (int i = arr_1.length; i < arr_3.length; i++) {
            arr_3[i] = arr_2[k];
            k++;
        }
        System.out.println(Arrays.toString(arr_3));
    }
}
