package lession_10_stack_queue.bai_tap.demerging;

import lession_1_introduction_to_java.Thuc_hanh.Kiem_tra_nam_nhuan.Nam;

import java.util.*;

public class MyQueue {
    public static class Nhansu {
        private String Name;
        private int Age;
        private String Gender;

        public Nhansu(String name, int age, String gender) {
            Name = name;
            Age = age;
            Gender = gender;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public String getGender() {
            return Gender;
        }

        public void setGender(String gender) {
            Gender = gender;
        }

        @Override
        public String toString() {
            return "Nhansu{" +
                    "Name='" + Name + '\'' +
                    ", Age=" + Age +
                    ", Gender='" + Gender + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Queue<Nhansu> nu = new LinkedList<>();
        Queue<Nhansu> nam = new LinkedList<>();

        List<Nhansu> nhansuList = new ArrayList<>();


        nhansuList.add(new Nhansu("long", 9, "nam"));
        nhansuList.add(new Nhansu("ly", 19, "nu"));
        nhansuList.add(new Nhansu("hung", 29, "nam"));
        nhansuList.add(new Nhansu("hue", 39, "nu"));
        nhansuList.add(new Nhansu("linh", 49, "nu"));
        nhansuList.add(new Nhansu("hai", 19, "nam"));
        nhansuList.add(new Nhansu("hoa", 91, "nu"));
        nhansuList.add(new Nhansu("phuong", 69, "nu"));
        nhansuList.add(new Nhansu("phong", 59, "nam"));
        nhansuList.add(new Nhansu("han", 99, "nam"));

        Collections.sort(nhansuList, new ComparatorByAge());
        for (Nhansu nhansu : nhansuList) {
            if (nhansu.getGender().equals("nam")) {
                nam.add(nhansu);
            } else {
                nu.add(nhansu);
            }
            System.out.println(nhansu);
        }
        System.out.println();
        nhansuList.clear();
        while (!nu.isEmpty()) {
            nhansuList.add(nu.poll());
        }
        while (!nam.isEmpty()) {
            nhansuList.add(nam.poll());
        }

        for (Nhansu nhansu : nhansuList) {
            System.out.println(nhansu);
        }
    }
}
