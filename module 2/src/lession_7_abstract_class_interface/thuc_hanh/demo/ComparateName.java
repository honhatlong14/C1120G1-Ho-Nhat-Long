package lession_7_abstract_class_interface.thuc_hanh.demo;

import java.util.Comparator;

public class ComparateName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
