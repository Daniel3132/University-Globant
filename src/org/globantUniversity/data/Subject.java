package org.globantUniversity.data;

import java.util.ArrayList;

public class Subject {
    private String name;
    private int classroom;
    private ArrayList<Student> studentsList;
    private Teacher teacher;

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

    private String getStudentsListString() {
        String studentsListString = "\n";
        for (Student student : studentsList) {
            studentsListString += student + " \n";
        }
        return studentsListString;
    }
    
    public String detailedToString() {
        return name +
        "   -   Classroom: " + classroom +
        "   -   Teacher: " + teacher.getFullName() + "\n" +
        studentsList.size() + " students in this class:" + getStudentsListString();
    }
    
    @Override
    public String toString() {
        return name +
                "   -   Classroom: " + classroom +
                "   -   No. students: " + studentsList.size() +
                "   -   Teacher: " + teacher.getFullName();
    }
}
