package org.globantUniversity.data;

public class Student {
    private int id;
    private String name;
    private int age;
    private static int count = 1;


    public Student( String name, int age) {
        this.id = count;
        count++;
        this.name = name;
        this.age = age;
    }


}
