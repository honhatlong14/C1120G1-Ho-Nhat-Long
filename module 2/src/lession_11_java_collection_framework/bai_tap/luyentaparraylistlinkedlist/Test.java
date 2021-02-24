package lession_11_java_collection_framework.bai_tap.luyentaparraylistlinkedlist;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int choose;
        do {
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm theo id");
            System.out.println("3.Xoá sản phẩm theo id");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7.Thoát");

            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    ProductManager.addProduct();
                    break;
                case 2:
                    ProductManager.setid();
                    break;
                case 3:
                    ProductManager.removeProduct();
                    break;
                case 4:
                    ProductManager.show();
                    break;
                case 5:
                    ProductManager.searchProduct();
                    break;
                case 6:
                    System.out.println("1. tang");
                    System.out.println("2. giam");
                    int choosen = scanner.nextInt();
                    switch (choosen){
                        case 1:
                            ProductManager.sapxeptang();
                            break;
                        case 2:
                            ProductManager.sapxepgiam();
                            break;
                    }
                    break;
            }
        } while (choose != 7);

//        ProductManager.addProduct();
//        ProductManager.show();
    }
}
