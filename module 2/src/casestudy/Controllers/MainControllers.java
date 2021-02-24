package casestudy.Controllers;

import java.util.*;

public class MainControllers {
    public static void main(String[] args) {
        MainControllers mainControllers = new MainControllers();
        mainControllers.displayMainMenu();
    }
    Scanner scanner = new Scanner(System.in);
    ManagerCinema managerCinema = new ManagerCinema();
    ManagerService managerService = new ManagerService();
    ManagerCustomer managerCustomer = new ManagerCustomer();
    ManagerBooking managerBooking = new ManagerBooking();
    ManagerEmployee managerEmployee = new ManagerEmployee();
    public void displayMainMenu() {
        do {
            System.out.println( "*---------------^*Menu*^----------------*" );
            System.out.println( "|      1. Add New Services              |" );
            System.out.println( "|      2. Show Services                 |" );
            System.out.println( "|      3. Add New Customer              |" );
            System.out.println( "|      4. Show Information Of Customer  |" );
            System.out.println( "|      5. Add New Booking               |" );
            System.out.println( "|      6. Show Information Of Employee  |" );
            System.out.println( "|      7. Cinema 4D                     |" );
            System.out.println( "|      8..Exit                          |" );
            System.out.println( "*---------------------------------------*" );
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    addService();
                    break;
                case 2:
                    showService();
                    break;
                case 3:
                    managerCustomer.addCustomer();
                    break;
                case 4:
                    managerCustomer.showInformationOfCustomer();
                    break;
                case 5:
                    managerBooking.addNewBooking();
                    break;
                case 6:
                    managerEmployee.showInformationE();
                    break;
                case 7:
                    managerCinema.displayListCustomer4D();
                    break;
                case 8: System.exit(8);
                default:
                    System.err.println("your chosen not in a file");
            }
        } while (true);
    }

    private void addService() {
        int input;
        do {
            System.out.println( "*---------^*Menu*^-----------*" );
            System.out.println( "|      1. Add New Villa      |" );
            System.out.println( "|      2. Add New House      |" );
            System.out.println( "|      3. Add New Room       |" );
            System.out.println( "|      4. Back to Menu       |" );
            System.out.println( "|      5. Exit               |" );
            System.out.println( "*----------------------------*" );
            System.out.println( "What do you want to choose? " );
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1: managerService.addVilla();
                    break;
                case 2: managerService.addHouse();
                    break;
                case 3: managerService.addRoom();
                    break;
                case 5:
                    System.exit(0);
            }

        } while (input !=4);
    }

    private void showService() {
        int input;
        do {
            System.out.println( "*----------------^*Menu*^------------------*" );
            System.out.println( "|      1.Show all Villa                    |" );
            System.out.println( "|      2.Show all House                    |" );
            System.out.println( "|      3.Show all Room                     |" );
            System.out.println( "|      4.Show All Name Villa Not Duplicate |" );
            System.out.println( "|      5.Show All Name House Not Duplicate |" );
            System.out.println( "|      6.Show All Name Name Not Duplicate  |" );
            System.out.println( "|      7.Back to Menu                      |" );
            System.out.println( "|      8.Exit                              |" );
            System.out.println( "*------------------------------------------*" );
            System.out.println( "What do you want to choose? " );
            input  = scanner.nextInt();
            switch (input) {
                case 1: managerService.showVilla();
                    break;
                case 2: managerService.showHouse();
                    break;
                case 3:managerService.showRoom();
                    break;
                case 4:managerService.showVillaNotDup();
                    break;
                case 5:managerService.showHouseNotDup();
                    break;
                case 6:managerService.showRoomNotDup();
                    break;
                case 7:
                    break;
                case 8:System.exit(8);
                 break;
            }
        } while (input != 7);
    }

}
