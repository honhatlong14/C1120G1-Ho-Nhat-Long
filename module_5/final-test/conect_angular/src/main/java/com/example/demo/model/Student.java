package com.example.demo.model;

public class Student {
    private String id;
    private String name_Student;
    private String name_Group;
    private String name_Topic;
    private String tutor;
    private String email;
    private String phone;

    public Student() {
    }

    public Student(String id, String name_Student, String name_Group, String name_Topic, String tutor, String email, String phone) {
        this.id = id;
        this.name_Student = name_Student;
        this.name_Group = name_Group;
        this.name_Topic = name_Topic;
        this.tutor = tutor;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName_Student() {
        return name_Student;
    }

    public void setName_Student(String name_Student) {
        this.name_Student = name_Student;
    }

    public String getName_Group() {
        return name_Group;
    }

    public void setName_Group(String name_Group) {
        this.name_Group = name_Group;
    }

    public String getName_Topic() {
        return name_Topic;
    }

    public void setName_Topic(String name_Topic) {
        this.name_Topic = name_Topic;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

