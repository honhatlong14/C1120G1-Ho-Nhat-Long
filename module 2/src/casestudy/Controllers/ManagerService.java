package casestudy.Controllers;


import casestudy.commons.read_and_write_file.ReadAndWriteFile;
import casestudy.commons.validate.validateservice.ValidateService;
import casestudy.models.service.House;
import casestudy.models.service.Room;
import casestudy.models.service.Villa;

import java.util.*;

public class ManagerService {
    Scanner scanner= new Scanner(System.in);
    public ManagerService(){

    }
    public void addVilla(){
        String id;
        String nameService;
        String area;
        String price;
        String people;
        String type;
        String typeService;
        String areaPool;
        String floor;
        do {
            System.out.println("Enter Id Service: ");
            id = scanner.nextLine();
            if (ValidateService.validateIdVilla(id)){
                break;
            }else {
                System.err.println("ID Villa Must Be In Format SVVL-XXXX ");
                System.out.println();
            }

        }while (true);
        do {
            System.out.println("Enter Name Of Service: ");
            nameService = scanner.nextLine();
            if (ValidateService.validateNameService(nameService)){
                break;
            }
            System.err.println("Only the first letter must be uppercase, try again !");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter area: ");
            area =scanner.nextLine();
            if (ValidateService.validateArea(area)){
                break;
            }
            System.err.println("Area must be greater than 30");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter price: ");
            price = scanner.nextLine();
            if (ValidateService.validatePrice(price)){
                break;
            }
            System.err.println("Price must be greater than 0, try again !");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter People: ");
            people = scanner.nextLine();
            if (ValidateService.validatePeople(people)){
                break;
            }
            System.err.println("number of people must be greater than 0 and smaller than 20 !");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter Type of Date: ");
            type = scanner.nextLine();
            if (ValidateService.validateType(type)){
                break;
            }
            System.err.println("Type of Date must be Day|Week|Month|Year! Please try again!");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter Type Of Service:");
            typeService=scanner.nextLine();
            if (ValidateService.validateTypeService(typeService)){
                break;
            }
            System.err.println("Type Of Service Vip|Business|Normal! Please try again!");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter Area Pool");
            areaPool = scanner.nextLine();
            if (ValidateService.validateAreaPool(areaPool)){
                break;
            }
            System.err.println("Pool area must be greater than 30");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter Floor: ");
            floor = scanner.nextLine();
            if (ValidateService.validateFloor(floor)){
                break;
            }
            System.err.println("Floor area must be greater than 0");
            System.out.println();
        }while (true);
        Villa villa = new Villa(id,nameService,area,price,people,type,typeService,areaPool,floor);
        ReadAndWriteFile.writeVilla(villa);
    }
    public void addHouse(){
        String id;
        String nameService;
        String area;
        String price;
        String people;
        String type;
        String typeHouse;
        String floor;

        do {
            System.out.println("Enter Id: ");
            id = scanner.nextLine();
             if (ValidateService.validateIdHouse(id)){
                break;
            }
            System.err.println("ID house must be in format SVHO-XXXX");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter Name Of Service: ");
            nameService = scanner.nextLine();
            if (ValidateService.validateNameService(nameService)){
                break;
            }
            System.err.println("Only the first letter must be uppercase, try again !");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter area: ");
            area =scanner.nextLine();
            if (ValidateService.validateArea(area)){
                break;
            }
            System.err.println("Area must be greater than 30");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter price: ");
            price = scanner.nextLine();
            if (ValidateService.validatePrice(price)){
                break;
            }
            System.err.println("Price must be greater than 0, try again !");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter People: ");
            people = scanner.nextLine();
            if (ValidateService.validatePeople(people)){
                break;
            }
            System.err.println("number of people must be greater than 0 and smaller than 20 !");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter Type Of Service:");
            type=scanner.nextLine();
            if (ValidateService.validateTypeService(type)){
                break;
            }
            System.err.println("Type Of Service Vip|Business|Normal! Please try again!");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter type Of House");
            typeHouse = scanner.nextLine();
            if (ValidateService.validateType(typeHouse)){
                break;
            }
            System.err.println("Type of Date must be Day|Week|Month|Year! Please try again!");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter Floor: ");
            floor = scanner.nextLine();
            if (ValidateService.validateFloor(floor)){
                break;
            }
            System.err.println("Floor area must be greater than 0");
            System.out.println();
        }while (true);
        House house = new House(id,nameService,area,price,people,type,typeHouse,floor );
        ReadAndWriteFile.writeHouse(house);
    }
    public void addRoom(){
        String id;
        String nameService;
        String area;
        String price;
        String people;
        String type;
        String freeService = "karaoke";
        do {
            System.out.println("Enter Id Service: ");
            id = scanner.nextLine();
            if (ValidateService.validateIdRoom(id)){
                break;
            }
            System.err.println("ID house must be in format SVRO-XXXX ");
            System.out.println();

        }while (true);
        do {
            System.out.println("Enter Name Of Service: ");
            nameService = scanner.nextLine();
            if (ValidateService.validateNameService(nameService)){
                break;
            }
            System.err.println("Only the first letter must be uppercase, try again !");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter area: ");
            area =scanner.nextLine();
            if (ValidateService.validateArea(area)){
                break;
            }
            System.err.println("Area must be greater than 30");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter price: ");
            price = scanner.nextLine();
            if (ValidateService.validatePrice(price)){
                break;
            }
            System.err.println("Price must be greater than 0, try again !");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter People: ");
            people = scanner.nextLine();
            if (ValidateService.validatePeople(people)){
                break;
            }
            System.err.println("number of people must be greater than 0 and smaller than 20 !");
            System.out.println();
        }while (true);
        do {
            System.out.println("Enter type Of Room");
            type = scanner.nextLine();
            if (ValidateService.validateType(type)){
                break;
            }
            System.err.println("Type of Date must be Day|Week|Month|Year! Please try again!");
            System.out.println();
        }while (true);
        Room room = new Room(id,nameService,area,price,people,type,freeService);
        ReadAndWriteFile.writeRoom(room);
    }

    public void showVilla(){
        ArrayList<Villa> villaArrayList = ReadAndWriteFile.readVilla();
        int count =1;
        System.out.println( "*---------------------------------------------------------------------------------------------" +
                "-------------------------------------------------------------------------------------------*" );
        System.out.printf( "%-5s%-13s%-15s%-20s%-16s%-16s%-15s%-25s%-20s%-16s", "NO", "ID SERVICE", "NAME SERVICE", "UNIT AREA SERVICE",
                "PRICE", "PEOPLE ", "TYPE OF RENT", "TYPE OF SERVICE", "AREA POOL", "FLOOR" );
        System.out.println();
        System.out.println();
        for (Villa villa : villaArrayList) {
            System.out.printf( "%-5s%-13s%-15s%-20s%-16s%-16s%-15s%-25s%-20s%-16s", count++, villa.getId(),
                    villa.getNameService(), villa.getArea(), villa.getPrice(), villa.getPeople(), villa.getType(),
                    villa.getTypeService(), villa.getAreaPool(), villa.getFloor());
            System.out.println();
        }
        System.out.println( "*---------------------------------------------------------------------------------------------" +
                "-------------------------------------------------------------------------------------------*" );
    }
    public void showVillaNotDup(){
        int count = 1;
        Set<String> villaNotDup=new TreeSet<>();
        ArrayList<Villa> villaArrayList = ReadAndWriteFile.readVilla();
        for (Villa villa:villaArrayList ){
            villaNotDup.add(villa.getNameService());
        }
        System.out.println( "*-------------------------*" );
        System.out.printf( "%-5s%-15s", "NO", "NAME SERVICE" );
        System.out.println();
        System.out.println();
        for (String villa:villaNotDup){
            System.out.printf( "%-5s%-15s", count++, villa );
            System.out.println();
        }
        System.out.println( "*-------------------------*" );
    }
    public void showHouse(){

        ArrayList<House>houseArrayList = ReadAndWriteFile.readHouse();
        int count =1;
        System.out.println( "*---------------------------------------------------------------------------------------------" +
                "-------------------------------------------------------------------------------------------*" );
        System.out.printf( "%-5s%-13s%-15s%-20s%-16s%-16s%-15s%-25s%-16s", "NO", "ID SERVICE", "NAME SERVICE", "UNIT AREA SERVICE",
                "PRICE", "PEOPLE ", "TYPE OF RENT", "TYPE OF HOUSE", "FLOOR" );
        System.out.println();
        System.out.println();
        for (House house : houseArrayList) {
            System.out.printf( "%-5s%-13s%-15s%-20s%-16s%-16s%-15s%-25s%-16s", count++, house.getId(), house.getNameService(), house.getArea(),
                    house.getPrice(), house.getPeople(), house.getType(), house.getTypeHouse(), house.getFloor());
            System.out.println();
        }
        System.out.println( "*---------------------------------------------------------------------------------------------" +
                "-------------------------------------------------------------------------------------------*" );
    }
    public void showHouseNotDup(){
        int count =1;
        Set<String> houseNotDup = new TreeSet<>();
        ArrayList<House> houseArrayList = ReadAndWriteFile.readHouse();
        for (House house : houseArrayList) {
            houseNotDup.add(house.getNameService());
        }
        System.out.println( "*-------------------------*" );
        System.out.printf( "%-5s%-15s", "NO", "NAME SERVICE" );
        System.out.println();
        System.out.println();
        for (String house:houseNotDup){
            System.out.printf( "%-5s%-15s", count++, house );
            System.out.println();
        }
        System.out.println( "*-------------------------*" );
    }
    public void showRoom(){
        ArrayList<Room>roomArrayList = ReadAndWriteFile.readRoom();
        int count =1;
//        for (Room room : roomArrayList) {
//            System.out.println(count+","+room.showInfo());
//            count++;
//        }
        System.out.println( "*---------------------------------------------------------------------------------------------" +
                "-------------------------------------------------------------------------------------------*" );
        System.out.printf( "%-5s%-13s%-15s%-20s%-16s%-16s%-15s%-16s", "NO", "ID SERVICE", "NAME SERVICE", "UNIT AREA SERVICE",
                "PRICE", "PEOPLE ", "TYPE OF RENT","FREE SERVICE" );
        System.out.println();
        System.out.println();
        for (Room room : roomArrayList) {
            System.out.printf( "%-5s%-13s%-15s%-20s%-16s%-16s%-15s%-16s", count++, room.getId(), room.getNameService(),
                    room.getArea(), room.getPrice(), room.getPeople(), room.getType(), room.getFreeService());
            System.out.println();
        }
        System.out.println( "*---------------------------------------------------------------------------------------------" +
                "-------------------------------------------------------------------------------------------*" );
    }
    public void showRoomNotDup(){
        int count =1;
        Set<String>roomNotDup = new TreeSet<>();
        ArrayList<Room> roomArrayList = ReadAndWriteFile.readRoom();
        for (Room room : roomArrayList) {
            roomNotDup.add(room.getNameService());
        }
        System.out.println( "*-------------------------*" );
        System.out.printf( "%-5s%-15s", "NO", "NAME SERVICE" );
        System.out.println();
        System.out.println();
        for (String room:roomNotDup){
            System.out.printf( "%-5s%-15s", count++, room );
            System.out.println();
        }
        System.out.println( "*-------------------------*" );
    }
    //Id tự tăng
    public String idVilla() {
        ArrayList<Villa> villaArrayList = ReadAndWriteFile.readVilla();
        if (!villaArrayList.isEmpty()) {
            int temp = Integer.parseInt(villaArrayList.get(0).getId().substring(5, 9));
            String tempIdString = null;
            for (int index = 0; index < villaArrayList.size() - 1; index++) {
                if (Integer.parseInt(villaArrayList.get(index).getId().substring(5, 9)) < Integer.parseInt(villaArrayList.
                        get(index + 1).getId().substring(5, 9))) {
                    temp = Integer.parseInt(villaArrayList.get(index + 1).getId().substring(5, 9));
                }
            }
            temp++;
            if (temp > 1000) {
                tempIdString = "SVVL-" + temp;
            } else if (temp > 100) {
                tempIdString = "SVVL-0" + temp;
            } else if (temp > 10) {
                tempIdString = "SVVL-00" + temp;
            } else {
                tempIdString = "SVVL-000" + temp;
            }
            return tempIdString;
        } else {
            return "SVVL-0001";
        }
    }
}
