package lession_1_introduction_to_java.Bai_2;

import java.util.Scanner;

public class so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("so can doc: ");
        int so = scanner.nextInt();
        if (so <10 && so >=0){
            switch (so){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        }
        if (so<20 && so>=10){
            if (so ==11||so == 12||so==15){
            switch (so) {
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("");
                    break;
                case 13:
                    System.out.println("ba");
                    break;
                case 14:
                    System.out.println("bon");
                    break;
                case 15:
                    System.out.println("nam");
                    break;
                case 16:
                    System.out.println("sau");
                    break;
                case 17:
                    System.out.println("bay");
                    break;
                case 18:
                    System.out.println("tam");
                    break;
                case 19:
                    System.out.println("chin");
                    break;
                case 20:
                    System.out.println("muoi");
                    break;
            }
            }
        }
    }
}
