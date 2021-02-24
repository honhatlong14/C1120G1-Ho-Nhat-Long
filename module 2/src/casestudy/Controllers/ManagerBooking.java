package casestudy.Controllers;

import casestudy.commons.exception.InputException;
import casestudy.commons.read_and_write_file.ReadAndWriteFile;
import casestudy.models.person.Customer;
import casestudy.models.service.Booking;
import casestudy.models.service.House;
import casestudy.models.service.Room;
import casestudy.models.service.Villa;

import java.util.List;

public class ManagerBooking {
    ManagerCustomer managerCustomer = new ManagerCustomer();
    ManagerService managerService = new ManagerService();

    public void addNewBooking() {
        List<Customer> list = ReadAndWriteFile.readCustomer();
        int choice;
        do {
            managerCustomer.showInformationOfCustomer();
            System.out.println(" Let enter Customer you wanna choice: ");
            choice = InputException.input();
            if (choice > 0 && choice <= list.size()) {
                break;
            } else {
                System.err.println("The number you selected not in the list");
            }
        } while (true);
        boolean check = true;
        do {
            System.out.println( "*-------------------*" );
            System.out.println( "|  1.Booking Villa  |" );
            System.out.println( "|  2.Booking House  |" );
            System.out.println( "|  3.Booking Room   |" );
            System.out.println( "|  4.Back to Menu   |" );
            System.out.println( "|  5.Exit           |" );
            System.out.println( "*-------------------*" );
            System.out.println( "What do you want to choose?" );
            int chosen = InputException.input();
            switch (chosen) {
                case 1:
                    addBookingVilla(choice);
                    break;
                case 2:
                    addBookingRoom(choice);
                    break;
                case 3:
                    addBookingHouse(choice);
                    break;
                case 4:
                    check = false;
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.err.println("The Number you selected not in the list");
            }
        } while (check);
    }

    public void addBookingVilla(int choice) {
        List<Customer> customerList = ReadAndWriteFile.readCustomer();
        List<Villa> villaList = ReadAndWriteFile.readVilla();
        int select;
        do {
            managerService.showVilla();
            System.out.println("Do you wanna booking Room? ");
            select = InputException.input();
            if (select > 0 && select <= customerList.size()) {
                break;
            } else {
                System.err.println("the number you selected is not in the list");
            }
        } while (true);
        String nameCustomer = customerList.get(choice - 1).getNameCustomer();
        String cardIdCustomer = customerList.get(choice - 1).getIdCard();
        String dateCustomer = customerList.get(choice - 1).getBirthDay();
        String idService = villaList.get(select - 1).getId();
        String nameService = villaList.get(select - 1).getNameService();
        Booking booking = new Booking(nameCustomer, cardIdCustomer, dateCustomer, idService, nameService);
        ReadAndWriteFile.writeBooking(booking);
//        if (booking.isEmpty()) {
//            file.bookingFile( booking.toString() );
//            break;
//        } else if (checkBookingList( idService ) && checkDateService( endDate( day ) )) {
//            file.bookingFile( booking.toString() );
//            break;
//        } else if (!checkBookingList( idService )) {
//            file.bookingFile( booking.toString() );
//            break;
//        } else {
//            System.err.println( "This service has been reserved" );
//            break;
//        }
//    }
    }

    public void addBookingRoom(int choice) {
        List<Customer> customerList = ReadAndWriteFile.readCustomer();
        List<Room> roomList = ReadAndWriteFile.readRoom();
        int select;
        do {
            managerService.showRoom();
            System.out.println("Do you wanna booking Room");
            select = InputException.input();
            if (select > 0 && select <= customerList.size()) {
                break;
            } else {
                System.err.println("the number you selected is not in the List");
            }
        } while (true);
        String nameCustomer = customerList.get(choice - 1).getNameCustomer();
        String cardIdCustomer = customerList.get(choice - 1).getIdCard();
        String dateCustomer = customerList.get(choice - 1).getBirthDay();
        String idService = roomList.get(select - 1).getId();
        String nameService = roomList.get(select - 1).getNameService();
        nameCustomer = roomList.get(select - 1).getNameService();
        Booking booking = new Booking(nameCustomer, cardIdCustomer, dateCustomer, idService, nameService);
        ReadAndWriteFile.writeBooking(booking);
    }

    public void addBookingHouse(int choice) {
        List<Customer> customerList = ReadAndWriteFile.readCustomer();
        List<House> houseList = ReadAndWriteFile.readHouse();
        int select;
        do {
            managerService.showHouse();
            System.out.println("Do you wanna booking house");
            select = InputException.input();
            if (select > 0 && select <= customerList.size()) {
                break;
            } else {
                System.err.println("The number you selected is not in the list");
            }
        } while (true);
        String nameCustomer = customerList.get(choice - 1).getNameCustomer();
        String cardIdCustomer = customerList.get(choice - 1).getIdCard();
        String dateCustomer = customerList.get(choice - 1).getBirthDay();
        String idService = houseList.get(select - 1).getId();
        String nameService = houseList.get(select - 1).getNameService();
        Booking booking = new Booking(nameCustomer, cardIdCustomer, dateCustomer, idService, nameService);
        ReadAndWriteFile.writeBooking(booking);
    }
}
