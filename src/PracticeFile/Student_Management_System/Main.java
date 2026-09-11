package PracticeFile.Student_Management_System;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Calculate Grade");
            System.out.println("7. Sort Students");
            System.out.println("8. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudent();
                    break;
                case 3:
                    searchStudetn();
                    break;
                case 4:
                    updatemarks();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    calculateGrade();
                    break;
                case 7:
                    sortStudent();
                    break;
                case 8:
                    System.out.println("Thank you for using for Student Management Systems.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

            while (choice != 5);
                sc.close();
            }

//  add student
            public static void addStudent() {
                System.out.println("\n----- Add Student -----");

                System.out.print("Enter Roll No: ");
                int rollNo = sc.nextInt();

                sc.nextLine(); // clear buffer

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Marks 1: ");
                int marks1 = sc.nextInt();

                System.out.print("Enter Marks 2: ");
                int marks2 = sc.nextInt();

                System.out.print("Enter Marks 3: ");
                int marks3 = sc.nextInt();

                Student student = new Student(
                        rollNo,
                        name,
                        marks1,
                        marks2,
                        marks3
                );

                students.add(student);

                System.out.println("Student added successfully!");
            }

// display all student

    public static void displayAllStudent() {
        if(students.isEmpty()){
            System.out.println("\nNo students available!");
            return;
        }
        System.out.println("\n===== ALL STUDENTS =====");

        for(Student student : students){
           student.display();
        }
            }

//  Search Students
    public static void searchStudetn() {
        System.out.println("\n----- Search Student -----");

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        for(Student student : students){
            if(student.getRollno() == rollNo){
                System.out.println("Student Found!");
                student.display();
                return;
            }
        }
        System.out.println("Student not found!");

    }

//    update studetns
    public static void updatemarks() {
        System.out.println("\n----- Update Marks -----");

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        for(Student student : students){
            if (student.getRollno() == rollNo) {

                System.out.println("Student Found!");

                System.out.print("Enter new Marks 1: ");
                int marks1 = sc.nextInt();

                System.out.print("Enter new Marks 2: ");
                int marks2 = sc.nextInt();

                System.out.print("Enter new Marks 3: ");
                int marks3 = sc.nextInt();

                student.setMark1(marks1);
                student.setMark2(marks2);
                student.setMark3(marks3);

                System.out.println("Marks updated successfully!");

                student.display();

                return;
            }
        }

        System.out.println("Student not found!");

    }
    public static void deleteStudent() {
        System.out.println("\n========== DELETE STUDENT ==========");

        System.out.println("Enter Roll No: ");
        int rollNo = sc.nextInt();

        for(Student student : students){
            if(student.getRollno() == rollNo){
                students.remove(student);

                System.out.println("Student deleted successfully!");

                return;
            }
        }
        System.out.println("Student not found!");
    }
    public static void calculateGrade() {
        System.out.println("\n========== CALCULATE GRADE ==========");

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        for(Student student : students){
            if(student.getRollno() == rollNo){
                System.out.println("Name       : " + student.getName());
                System.out.printf(
                        "Percentage : %.2f%%\n",
                        student.CalculatePrecentage()
                );
                System.out.println(
                        "Grade      : " + student.CalculateGrade()
                );

                return;
            }
        }
        System.out.println("Student not found!");
    }
    public static void sortStudent() {
        System.out.println("\n========== SORT STUDENTS ==========");

        System.out.println("1. Sort by Roll No");
        System.out.println("2. Sort by Name");
        System.out.println("3. Sort by Percentage");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:

                students.sort(
                        Comparator.comparingInt(Student::getRollno)
                );

                System.out.println("Students sorted by Roll No.");

                break;

            case 2:

                students.sort(
                        Comparator.comparing(Student::getName)
                );

                System.out.println("Students sorted by Name.");

                break;

            case 3:

                students.sort(
                        Comparator.comparingDouble(
                                Student::CalculatePrecentage
                        ).reversed()
                );

                System.out.println(
                        "Students sorted by Percentage (High to Low)."
                );

                break;

            default:

                System.out.println("Invalid choice!");
        }
    }
    }





