package org.globantUniversity.data;

public class Student {
    private int id;
    private String fullName;
    private int age;
    private static int count = 1;

    public Student(){}
    
    public Student(String fullName, int age) {
        this.id = count;
        count++;
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "#" + id +
                " Name: " + fullName +
                " Age: " + age;
    }

}
