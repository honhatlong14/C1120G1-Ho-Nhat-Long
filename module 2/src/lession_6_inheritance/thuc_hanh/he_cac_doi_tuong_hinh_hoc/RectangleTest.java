package lession_6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        System.out.println(rectangle);

        rectangle =new Rectangle(10,20);
        System.out.println(rectangle);
        rectangle = new Rectangle(10,20,"red",true);

    }
}
