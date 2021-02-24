package lession_3_Array_and_method.Bai_tap.Remove_element_in_array;

import java.util.Scanner;

public class Remove_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Input X to remove: ");

        int input = 0;
        input = sc.nextInt();

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == input) {
                for (int i = index; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
            }
        }
        arr[arr.length - 1] = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
