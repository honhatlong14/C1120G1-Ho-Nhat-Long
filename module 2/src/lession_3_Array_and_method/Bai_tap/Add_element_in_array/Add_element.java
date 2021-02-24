package lession_3_Array_and_method.Bai_tap.Add_element_in_array;

import java.util.Scanner;

public class Add_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 0, 0, 0};
        System.out.println("Enter X to add");
        int intput = 0;
        intput = sc.nextInt();
        System.out.println("Enter position X to add: ");
        int index = 0;
        index = sc.nextInt();
        if (index <= 1 || index >= arr.length - 1) {
            System.out.println("can't add element");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = intput;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}