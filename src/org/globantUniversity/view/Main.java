package org.globantUniversity.view;

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

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

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
    }

    public static void printTeachersData() {

    }

    public static void printSubjectsData() {
        Scanner input = new Scanner(System.in);

        String option = input.nextLine();
        input = new Scanner(System.in);

        boolean runSubjectMenu = true;
        do {
            System.out.println("Select an option!" +
                    "\n 1. Detail a subject" +
                    "\n 2. Exit to main menu");

            switch (option) {
                case "1":

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

    public static void CreateStudent() {

    }

    public static void CreateSubject() {

    }

    public static void PrintStudentSubjects() {

    }

}