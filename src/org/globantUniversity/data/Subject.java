package org.globantUniversity.data;

import java.util.List;

public class Subject {
    private String name;
    private int classroom;
    private List<Student> studentsList;
    private Teacher teacher;

    public Subject(String name, int classroom, List<Student> studentsList, Teacher teacher) {
        this.name = name;
        this.classroom = classroom;
        this.studentsList = studentsList;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return name +
                "   Classroom: " + classroom +
                "   Students: " + studentsList +
                "   Teacher: " + teacher;
    }

}
