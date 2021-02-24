package lession_11_java_collection_framework.bai_tap.luyentaparraylistlinkedlist;

import com.sun.scenario.animation.shared.ClipEnvelope;

import java.util.*;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    public static List<Product> list = new ArrayList<>();

    public static void addProduct() {
        System.out.printf("nhap vap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("nhap gia: ");
        double gia = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, gia);
        list.add(product);
    }

    public static void removeProduct() {
        System.out.printf("nhap vap id: ");
        int id = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                index = i;
            }
        }
        list.remove(index);
    }

    public static void searchProduct() {
        int id = scanner.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println(list.get(i));
            }
        }

    }

    public static void sapxeptang() {
        SapXepTang sapXepTang = new SapXepTang();
        Collections.sort(list, sapXepTang);
    }

    public static void sapxepgiam() {
        SapXepgiam sapXepgiam = new SapXepgiam();
        Collections.sort(list, sapXepgiam);
    }

    public static void setid() {
        int index = -1;
        System.out.println("nhap id: ");
        int id = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                index = i;
            }
        }
        System.out.println("1." + list.get(index).getId());
        System.out.println("2." + list.get(index).getName());
        System.out.println("3." + list.get(index).getGia());
        System.out.println("ban muon sua gi : ");
        int chon = scanner.nextInt();
        scanner.nextLine();
        switch (chon){
            case 1:
                System.out.println("Nhap vao id : ");
                int idAfter = scanner.nextInt();
                list.get(index).setId(idAfter);
                break;
            case 2:
                System.out.println("Nhap vao name : ");
                String nameAfter = scanner.nextLine();
                list.get(index).setName(nameAfter);
                break;
            case 3:
                System.out.println("Nhap vao gia : ");
                Double giaAfter = scanner.nextDouble();
                list.get(index).setGia(giaAfter);
                break;
        }
    }

    public static void show() {
        for (Product p : list) {
            System.out.println(p.toString());
        }
    }
}

