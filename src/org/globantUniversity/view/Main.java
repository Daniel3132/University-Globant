package org.globantUniversity.view;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean runMenu = true;
        do {
            System.out.println("Select an option!" +
                    "\n 1. Check teachers data" +
                    "\n 2. Check Subjects" +
                    "\n 3. Create Student" +
                    "\n 4. Create Subject" +
                    "\n 5. Check student Subjects" +
                    "\n 6. Exit");

            // option is String to avoid app closes because of missmatching input
            String option = input.nextLine();
            input = new Scanner(System.in);

            switch (option) {
                case "1":
                    printTeachersData(input);
                    break;
                case "2":
                    printSubjectsData(input);
                    break;
                case "3":
                    createStudent(input);
                    break;
                case "4":
                    createSubject(input);
                    break;
                case "5":
                    printStudentSubjects(input);
                    break;
                case "6":
                    System.out.println("Have a nice day :D");
                    runMenu = false;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (runMenu);

        input.close();
    }

    public static void printTeachersData(Scanner input) {
        // access to teachers by university
    }

    public static void printSubjectsData(Scanner input) {

        String option = input.nextLine();
        input = new Scanner(System.in);

        boolean runSubjectMenu = true;
        do {
            System.out.println("Select an option!" +
                    "\n 1. Detail a subject" +
                    "\n 2. Exit to main menu");

            switch (option) {
                case "1":
                    System.out.println("Enter the subject name");
                    String name = input.nextLine();
                    input.close();

                    // search by name
                    // print subject by university
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

    public static void createStudent(Scanner input) {

        System.out.println("Enter the name");
        String name = input.nextLine();
        input.close();

        System.out.println("Enter the age");
        int age = input.nextInt();
        input.close();

        // call student constructor by university

        System.out.println("Student " + name + "added successfully");
    }

    public static void createSubject(Scanner input) {
        System.out.println("Enter the name");
        String name = input.nextLine();
        input.close();

        System.out.println("Enter the classroom number");
        int classroom = input.nextInt();
        input.close();

        System.out.println("Enter the teacher id");
        int teacherId = input.nextInt();
        input.close();

        ArrayList<Integer> studentsIdList = new ArrayList<Integer>();

        String option = input.nextLine();
        input.close();
        boolean runAddStudentsMenu = true;
        do {
            System.out.println("Select an option!" +
                    "\n 1. Enter the Student id to add it to the Subject list" +
                    "\n 2. Finish and exit to main menu");

            switch (option) {
                case "1":
                    System.out.println("Enter the teacher id");
                    int studentId = input.nextInt();
                    input.close();

                    studentsIdList.add(studentId);
                    break;
                case "2":
                    // turn studentsIdList in to newStudentsList
                    // create subject by university

                    System.out.println("Subject " + name + " added successfully");
                    runAddStudentsMenu = false;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (runAddStudentsMenu);
    }

    public static void printStudentSubjects(Scanner input) {
        // access to list and print it
    }

}