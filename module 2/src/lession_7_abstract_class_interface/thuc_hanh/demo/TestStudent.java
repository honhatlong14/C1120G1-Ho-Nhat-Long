package lession_7_abstract_class_interface.thuc_hanh.demo;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("hai",50);
        Student student2 = new Student("huy",15);
        Student student3 = new Student("hung",25);

        Student array[] = new Student[3];
        array[0] = student1;
        array[1] = student2;
        array[2] = student3;
        ComparateName comparateName = new ComparateName();
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        for (Student student:array) {
            System.out.println(student);
        }
    }
}
