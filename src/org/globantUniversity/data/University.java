package org.globantUniversity.data;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Teacher> teachersList;
    private List<Student> studentsList;
    private List<Subject> subjectsList;

    public University() {
        this.teachersList = new ArrayList<>();
        this.studentsList = new ArrayList<>();
        this.subjectsList = new ArrayList<>();
    }

    public void registerTeacher(Teacher teacher){
        this.teachersList.add(teacher);
    }
    
    public void registerStudent(Student student){
        this.studentsList.add(student);
    }
    
    public void registerSubject(Subject subject){
        this.subjectsList.add(subject);
    }
    
    public Teacher getTeacher(int index){
        return this.teachersList.get(index);
    }

    public Student getStudent(int index){
        return this.studentsList.get(index);
    }
}