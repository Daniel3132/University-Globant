package org.globantUniversity.persistence;

import java.util.ArrayList;

import org.globantUniversity.data.FullTimeTeacher;
import org.globantUniversity.data.PartTimeTeacher;
import org.globantUniversity.data.Student;
import org.globantUniversity.data.Subject;
import org.globantUniversity.data.Teacher;
import org.globantUniversity.data.University;

public class Initializer {

    public static University createUniversity() {
        University university = new University();
        createTeachers(university);
        createStudents(university);
        createSubjects(university); 
        return university;
    }

     public static void createTeachers(University university) {
        PartTimeTeacher PTteacher1 = new PartTimeTeacher("Sandra Gutierrez",7);
        PartTimeTeacher PTteacher2 = new PartTimeTeacher("Nicolas Cardenas",8);
        FullTimeTeacher FTteacher1 = new FullTimeTeacher("Sebastian Forero", 2);
        FullTimeTeacher FTteacher2 = new FullTimeTeacher("Carolin Zambrano", 4);

        university.registerTeacher(PTteacher1);
        university.registerTeacher(PTteacher2);
        university.registerTeacher(FTteacher1);
        university.registerTeacher(FTteacher2);
    }

    public static void createStudents(University university) {
        Student student1 = new Student("Daniel Correa", 23);
        Student student2 = new Student("Sergio Zipa", 23);
        Student student3 = new Student("Cristian Martinez", 23);
        Student student4 = new Student("Sebastian Moreno", 23);
        Student student5 = new Student("Santiago Bayona", 23);
        Student student6 = new Student("Andres Caro", 23);

        university.registerStudent(student1);
        university.registerStudent(student2);
        university.registerStudent(student3);
        university.registerStudent(student4);
        university.registerStudent(student5);
        university.registerStudent(student6);
    }

   public static void createSubjects(University university) {
        ArrayList<Student> mathStudents = new ArrayList<Student>();
        mathStudents.add(university.getStudentByIndex(0));
        mathStudents.add(university.getStudentByIndex(1));
        mathStudents.add(university.getStudentByIndex(2));
        mathStudents.add(university.getStudentByIndex(3));
        mathStudents.add(university.getStudentByIndex(4));
        Teacher mathTeacher = university.getTeacherByIndex(0);
        Subject math = new Subject("Math", 101, mathStudents , mathTeacher);
        university.registerSubject(math);

        ArrayList<Student> scienceStudents = new ArrayList<Student>();
        scienceStudents.add(university.getStudentByIndex(0));
        scienceStudents.add(university.getStudentByIndex(1));
        scienceStudents.add(university.getStudentByIndex(2));
        Teacher scienceTeacher = university.getTeacherByIndex(1);
        Subject science = new Subject("Science", 103, scienceStudents ,scienceTeacher);
        university.registerSubject(science);

        ArrayList<Student> physicsStudents = new ArrayList<Student>();
        physicsStudents.add(university.getStudentByIndex(3));
        physicsStudents.add(university.getStudentByIndex(4));
        physicsStudents.add(university.getStudentByIndex(5));
        Teacher physicsTeacher = university.getTeacherByIndex(2);
        Subject physics = new Subject("Physics", 102, physicsStudents ,physicsTeacher);
        university.registerSubject(physics);

        ArrayList<Student> ethicsStudents = new ArrayList<Student>();
        ethicsStudents.add(university.getStudentByIndex(2));
        ethicsStudents.add(university.getStudentByIndex(3));
        ethicsStudents.add(university.getStudentByIndex(4));
        ethicsStudents.add(university.getStudentByIndex(5));
        Teacher ethicsTeacher = university.getTeacherByIndex(3);
        Subject ethics = new Subject("Ethics", 104, ethicsStudents ,ethicsTeacher);
        university.registerSubject(ethics);
    }

}
