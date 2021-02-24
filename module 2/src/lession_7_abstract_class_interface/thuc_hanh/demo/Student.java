package lession_7_abstract_class_interface.thuc_hanh.demo;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.getName().compareTo(o.getName())>0){
            return 1;
        }else if (this.getName().compareTo(o.getName())<0){
            return -1;
        } else {
            if (this.getAge() > o.getAge()) {
                return 1;
            }else if(this.getAge() < o.getAge()){
                return -1;
            }else {
                return 0;
            }
        }

    }
}
