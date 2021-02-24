package casestudy.commons.read_and_write_file;

import casestudy.models.person.Customer;
import casestudy.models.service.Booking;
import casestudy.models.service.House;
import casestudy.models.service.Room;
import casestudy.models.service.Villa;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFile {
    public static void writeVilla(Villa villa){
        try {
            FileWriter fileWriter = new FileWriter(getFile("src/casestudy/data/Villa.csv"), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(villa.showInfo() + "\n");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static File getFile(String path) {
        File file = new File(path);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }
    public static void writeHouse(House house){
        try {
            FileWriter fileWriter = new FileWriter(getFile("src/casestudy/data/House.csv"),true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(house.showInfo()+"\n");
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void writeRoom(Room room){
        try {
            FileWriter fileWriter = new FileWriter(getFile("src/casestudy/data/Room.csv"),true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(room.showInfo()+ "\n");
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static ArrayList<Villa> readVilla(){
        ArrayList<Villa> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src/casestudy/data/Villa.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String [] arrayFile;
            while ((line=bufferedReader.readLine())!=null){
                arrayFile = line.split(",");
                Villa villa =new Villa(arrayFile[0],arrayFile[1],arrayFile[2],arrayFile[3],arrayFile[4],
                        arrayFile[5],arrayFile[6],arrayFile[7],arrayFile[8]);
                list.add(villa);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    public static ArrayList<House> readHouse() {
        ArrayList<House> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src/casestudy/data/House.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            String[] arrayFile;
            while ((line = bufferedReader.readLine()) != null) {
                arrayFile = line.split(",");
                House house = new House(arrayFile[0], arrayFile[1], arrayFile[2], arrayFile[3], arrayFile[4],
                        arrayFile[5], arrayFile[6], arrayFile[7]);
                list.add(house);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static ArrayList<Room> readRoom(){
        ArrayList<Room> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src/casestudy/data/Room.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String [] arrayFile;
            while ((line=bufferedReader.readLine())!=null){
                arrayFile = line.split(",");
                Room room = new Room(arrayFile[0],arrayFile[1],arrayFile[2],arrayFile[3],arrayFile[4],arrayFile[5],arrayFile[6]);
                list.add(room);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    public static ArrayList<Customer> readCustomer(){
        ArrayList<Customer>list =new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/casestudy/data/Customer.csv"));
            String line;
            String[] arrayFile;
            while ((line=bufferedReader.readLine())!=null){
                arrayFile = line.split(",");
               Customer customer = new Customer(arrayFile[0],arrayFile[1],arrayFile[2],arrayFile[3],arrayFile[4],
                       arrayFile[5],arrayFile[6],arrayFile[7]);
               list.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void writeCustomer(Customer customer){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(getFile("src/casestudy/data/Customer.csv"),true));
            bufferedWriter.write(customer.showInfo()+"\n");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void readBooking(){
        ArrayList<Booking> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/casestudy/data/Booking.csv"));
            String line;
            String[] arrayFile;
            while ((line=bufferedReader.readLine())!=null){
                arrayFile = line.split(",");
                Booking booking = new Booking(arrayFile[0],arrayFile[1],arrayFile[2],arrayFile[3],arrayFile[4]);
                list.add(booking);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeBooking(Booking booking) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(getFile("src/casestudy/data/Booking.csv"),true));
            bufferedWriter.write(booking.toString()+"\n");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
