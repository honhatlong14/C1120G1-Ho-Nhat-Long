package lession_4_class_and_object_in_iava.Bai_tap.hinh;

public class main {
    public static void main(String[] args) {
        HinhChu hinhChu = new HinhChu();
        System.out.println("dien tich hinh chu nhat la: "+ hinhChu.getArea());
        //muon truyen vao doi so moi thi phai goi constructor
        HinhChu hinhChu1 =new HinhChu(12,31);
        System.out.println("dien tic hinh chu nhat la: " + hinhChu1.getArea());
    }
}
