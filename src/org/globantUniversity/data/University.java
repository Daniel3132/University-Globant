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

    public Teacher getTeacherByIndex(int index) {
        return this.teachersList.get(index);
    }
    
    public Subject getSubjectByIndex(int index) {
        return this.subjectsList.get(index);
    }

    public Student getStudentByIndex(int index) {
        return this.studentsList.get(index);
    }
    
    public Student getStudentById(int id) {
        Student nullStudent = new Student();
        for (Student student : studentsList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return nullStudent;
    }

    public Teacher getTeacherById(int id) {
        for (Teacher Teacher : teachersList) {
            if (Teacher.getTeacherId() == id) {
                return Teacher;
            }
        }
        return null;
    }
    
    public Subject getSubjectByName(String name) {
        Subject nullSubject = new Subject();
        for (Subject subject : subjectsList) {
            if (subject.getName().toLowerCase() == name.toLowerCase()) {
                nullSubject = subject;
                System.out.println(subject);
            }
        }
        return nullSubject;
    }
    
    public int getTeachersListSize() {
        return this.teachersList.size();
    }
    
    public int getStudentsListSize() {
        return this.studentsList.size();
    }
    
    public int getSubjectsListSize() {
        return this.subjectsList.size();
    }
    
    public void registerTeacher(Teacher teacher) {
        this.teachersList.add(teacher);
    }
    
    public void registerStudent(Student student) {
        this.studentsList.add(student);
    }
    
    public void registerSubject(Subject subject) {
        this.subjectsList.add(subject);
    }
    
    public void createStudent(String name, int age) {
        Student newStudent = new Student(name, age);
        registerStudent(newStudent);
    }
    
    public void createSubject(String name, int classroom, ArrayList<Student> studentsList, Teacher teacher) {
        Subject newSubject = new Subject(name, classroom, studentsList, teacher);
        registerSubject(newSubject);
    }
}