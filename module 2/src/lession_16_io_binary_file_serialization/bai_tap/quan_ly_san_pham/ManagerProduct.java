package lession_16_io_binary_file_serialization.bai_tap.quan_ly_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    static Scanner scanner = new Scanner(System.in);

   private static final String FILE_PATH = "src/lession_16_io_binary_file_serialization/bai_tap/quan_ly_san_pham/ProductManager.csv";

    public static void addProduct(){
        List<Product> list = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            Product product = (Product) objectInputStream.readObject();
            while (product !=null){
                list.add(product);
                product= (Product) objectInputStream.readObject();
            }
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Enter id ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name ");
        String name = scanner.nextLine();
        System.out.println("Enter Manufacturer ");
        String brand = scanner.nextLine();
        System.out.println("Enter Price ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Other ");
        String other =scanner.nextLine();
        Product productNew = new Product(id,name,brand,price,other);
        list.add(productNew);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            for (int i = 0; i <list.size() ; i++) {
                objectOutputStream.writeObject(list.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void searchProduct(){
        List<Product> list = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            Product product = (Product) objectInputStream.readObject();
            while (product !=null){
                list.add(product);
                product= (Product) objectInputStream.readObject();
            }
        } catch (EOFException e) {
//            System.out.println("Da het file roi");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Enter Id: ");
        int id = scanner.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println(list.get(i));
            }
        }
    }
    public static void show() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            Product product = (Product) objectInputStream.readObject();
            while (product !=null){
                System.out.println(product);
                product= (Product) objectInputStream.readObject();
            }
        } catch (EOFException e) {
            System.out.println("File is over");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add Product ");
            System.out.println("2.Search Product");
            System.out.println("3.Product display");
            System.out.println("4.Exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ManagerProduct.addProduct();
                    break;
                case 2:
                    ManagerProduct.searchProduct();
                    break;
                case 3:
                    ManagerProduct.show();
                    break;
            }
        }while (choice != 4);
    }
}