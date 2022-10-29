package org.globantUniversity.data;

import java.util.ArrayList;

public class University {
    private ArrayList<Teacher> teachersList;
    private ArrayList<Student> studentsList;
    private ArrayList<Subject> subjectsList;

    public University() {
        this.teachersList = new ArrayList<>();
        this.studentsList = new ArrayList<>();
        this.subjectsList = new ArrayList<>();
    }

    public ArrayList<Subject> getSubjectsList() {
        return subjectsList;
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
        name = name.toLowerCase();
        
        for (Subject subject : subjectsList) {
            String currentSubjectName = subject.getName().toLowerCase();
            
            if (currentSubjectName.equals(name)) {
                return subject;
            }
        }
        return null;
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

    public String getStudentSubjects(int id) {
        String subjectsString = "";
        for (Subject subject : this.subjectsList) {
            for (Student student : subject.getStudentsList()) {
                if (student.getId() == id) {
                    subjectsString += subject.getName() + "  |  ";
                }
            }
        }
        return subjectsString;
    }
}