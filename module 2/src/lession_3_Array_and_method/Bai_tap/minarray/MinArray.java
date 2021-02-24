package lession_3_Array_and_method.Bai_tap.minarray;

public class MinArray {
    public static void main(String[] args) {
        int number []= {12,45,32,15,85,65,74,10,9,8,};
        int min = number[0];

        for (int i = 0; i<number.length; i++){
            if (number[i] < min){
                min = number[i];
            }
        }
        System.out.println("GTNN : " + min);
    }
}
