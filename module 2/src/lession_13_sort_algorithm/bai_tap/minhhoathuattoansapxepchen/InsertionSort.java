package lession_13_sort_algorithm.bai_tap.minhhoathuattoansapxepchen;

public class InsertionSort {
    public void insertionSort(int arr[]) {
        int value;
        int index;
        int i;

        // lap qua tat ca cac so
        for (i = 1; i < arr.length; i++) {

            // chon mot gia tri de chen
            value = arr[i];

            // lua chon vi tri de chen
            index = i;

            // kiem tra xem so lien truoc co lon hon gia tri duoc chen khong
            while (index > 0 && arr[index - 1] > value) {
                arr[index] = arr[index - 1];
                index--;
                System.out.println("Di chuyen phan tu: " + arr[index]);
            }

            if (index != i) {
                System.out.println(" Chen phan tu: " + value
                        + ", tai vi tri: " + index);
                // chen phan tu tai vi tri chen
                arr[index] = value;
            }

            System.out.println("Vong lap thu " + i);
            display(arr);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");

        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };

        InsertionSort sapXepChen = new InsertionSort();
        System.out.println("Mang du lieu dau vao: ");
        sapXepChen.display(arr);
        System.out.println("-----------------------------");
        sapXepChen.insertionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        sapXepChen.display(arr);
    }
}

