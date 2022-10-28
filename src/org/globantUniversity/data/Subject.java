package org.globantUniversity.data;

import java.util.ArrayList;

public class Subject {
    private String name;
    private int classroom;
    private ArrayList<Student> studentsList;
    private Teacher teacher;

    public Subject(){}

    public Subject(String name, int classroom, ArrayList<Student> studentsList, Teacher teacher) {
        this.name = name;
        this.classroom = classroom;
        this.studentsList = studentsList;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    @Override
    public String toString() {
        return name +
                "   -   Classroom: " + classroom +
                "   -   No. students: " + studentsList.size() +
                "   -   Teacher: " + teacher.getFullName();
    }

}
