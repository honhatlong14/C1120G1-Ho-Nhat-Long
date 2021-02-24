package casestudy.commons.exception;

import java.util.Scanner;

public class InputException {
    public static int input(){
        Scanner scanner =new Scanner(System.in);
        int number;
        do {
            try{
                number = Integer.parseInt(scanner.nextLine());
                break;
            }catch (Exception e){
                System.err.println("Please Enter A Number!");
            }
        }while (true);
        return number;
    }
}
