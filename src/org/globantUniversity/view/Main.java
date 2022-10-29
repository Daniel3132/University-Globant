package org.globantUniversity.view;

import java.util.ArrayList;
import java.util.Scanner;

import org.globantUniversity.data.Student;
import org.globantUniversity.data.Subject;
import org.globantUniversity.data.Teacher;
import org.globantUniversity.data.University;
import org.globantUniversity.persistence.Initializer;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        University university = Initializer.createUniversity();

        boolean runMenu = true;
        do {
            System.out.println("\n\n                          Welcome to Globant University!\n" +
                    "\n Select an option!" +
                    "\n    1. Check teachers data" +
                    "\n    2. Check Subjects" +
                    "\n    3. Create Student" +
                    "\n    4. Create Subject" +
                    "\n    5. Check student Subjects" +
                    "\n    6. Check students" +
                    "\n    7. Exit");

            // option is String to avoid app closes because of missmatching input
            String option = input.nextLine();
            input = new Scanner(System.in);

            switch (option) {
                case "1":
                    printTeachersData(university);
                    break;
                case "2":
                    printSubjectsData(university);
                    break;
                case "3":
                    createStudent(university);
                    break;
                case "4":
                    createSubject(university);
                    break;
                case "5":
                    printStudentSubjects(university);
                    break;
                case "6":
                    printStudentsData(university);
                    break;
                case "7":
                    System.out.println("Have a nice day :D");
                    runMenu = false;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (runMenu);

        input = new Scanner(System.in);
    }

    public static void printTeachersData(University university) {
        if (university.getTeachersListSize() == 0) {
            System.out.println("There is not teachers");
        }
        System.out.println("                    Teachers\n");
        for (int i = 0; i < university.getTeachersListSize(); i++) {
            System.out.println(university.getTeacherByIndex(i));
        }
    }

    public static void printSubjectsData(University university) {

        for (int i = 0; i < university.getSubjectsListSize(); i++) {
            System.out.println("\n" + university.getSubjectByIndex(i));
        }

        Scanner input = new Scanner(System.in);

        boolean runSubjectMenu = true;
        do {
            System.out.println("\nSelect an option!" +
                    "\n 1. Detail a subject" +
                    "\n 2. Exit to main menu");

            String option = input.nextLine();
            input = new Scanner(System.in);
            switch (option) {
                case "1":
                    System.out.println("Enter the subject name");
                    String name = input.nextLine();
                    input = new Scanner(System.in);

                    Subject chosenSubject = university.getSubjectByName(name);
                    if (chosenSubject == null) {
                        System.out.println("\nThis Subject does not exist!");
                    } else {
                        System.out.println("\n" + chosenSubject.detailedToString());
                    }
                    break;
                case "2":
                    runSubjectMenu = false;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (runSubjectMenu);

    }

    public static void createStudent(University university) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the full name");
        String name = input.nextLine();
        input = new Scanner(System.in);

        System.out.println("Enter the age");
        int age = input.nextInt();
        input = new Scanner(System.in);

        university.createStudent(name, age);

        System.out.println("Student " + name + " added successfully");
    }

    public static void createSubject(University university) {
        Scanner input = new Scanner(System.in);

        String name;
        boolean teacherNameIsInvalid = true;
        do {
            System.out.println("Enter the name");
            name = input.nextLine();
            input = new Scanner(System.in);

            if (university.getSubjectByName(name) != null) {
                System.out.println("This subject already exist!");
            } else {
                teacherNameIsInvalid = false;
            }

        } while (teacherNameIsInvalid);

        System.out.println("Enter the classroom number");
        int classroom = input.nextInt();
        input = new Scanner(System.in);

        int teacherId;
        boolean teacherIdIsInvalidId = true;
        do {
            System.out.println("Enter the teacher id");
            teacherId = input.nextInt();
            input = new Scanner(System.in);

            if (university.getTeacherById(teacherId) == null) {
                System.out.println("Invalid Id");
            } else {
                Teacher chosenTeacher = university.getTeacherById(teacherId);
                System.out.println("Teacher " + chosenTeacher.getFullName() + " added successfully!");
                teacherIdIsInvalidId = false;
            }

        } while (teacherIdIsInvalidId);

        ArrayList<Student> studentsToAddList = new ArrayList<Student>();

        boolean runAddStudentsMenu = true;
        do {
            System.out.println("\nSelect an option!" +
                    "\n 1. Add Student by id to the Subject list" +
                    "\n 2. Finish and exit to main menu");

            String option = input.nextLine();
            input = new Scanner(System.in);
            switch (option) {
                case "1":
                    System.out.println("Enter the student id");
                    int studentId = input.nextInt();
                    input = new Scanner(System.in);

                    Student studentToAdd = university.getStudentById(studentId);
                    if (studentToAdd.getFullName() == null) {
                        System.out.println("This student does not exits!");
                    } else {
                        studentsToAddList.add(studentToAdd);
                        System.out.println("Student " + studentToAdd.getFullName() + " added successfully");
                    }

                    break;
                case "2":
                    university.createSubject(name, classroom, studentsToAddList, university.getTeacherById(teacherId));

                    System.out.println("Subject " + name + " added successfully");
                    runAddStudentsMenu = false;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (runAddStudentsMenu);
    }

    public static void printStudentSubjects(University university) {
        Scanner input = new Scanner(System.in);

        int id;
        boolean idIsInvalid = true;
        do {
            System.out.println("\nEnter the student id");
            id = input.nextInt();
            input = new Scanner(System.in);

            if (university.getStudentById(id) == null) {
                System.out.println("\nThis id does not exist!");
            } else {
                idIsInvalid = false;
            }
        } while (idIsInvalid);

        if (university.getStudentById(id) == null) {
            System.out.println("Invalid ID");
        } else {
            System.out.println("\nStudent:       " + university.getStudentById(id) +
                    "\nIs taking:       " + university.getStudentSubjects(id));
        }
    }

    public static void printStudentsData(University university) {
        if (university.getStudentsListSize() == 0) {
            System.out.println("There is not Students");
        }
        System.out.println("                    Students\n");
        for (int i = 0; i < university.getStudentsListSize(); i++) {
            System.out.println(university.getStudentByIndex(i));
        }
    }
}