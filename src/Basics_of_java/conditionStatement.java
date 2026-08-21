package Basics_of_java;//import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class conditionStatement {
    public static void main(String[] args) {
//        int age = 13;
//        if( age> 18 ){
//            System.out.println("Eligibale for vote");
//        }
//        else {
//            System.out.println("Not Eligible for vote");
//        }

        System.out.println("Enter the student marks for grade : ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
//        int marks = 15;
        if (marks > 90){
            System.out.println("Grade A");
        } else if (marks > 80) {
            System.out.println("Grade B");
        }
        else if (marks > 70) {
            System.out.println("Grade C");
        }
        else if(marks >60 ){
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }

//        System.out.println("Enter the days ");
//        Scanner sc = new Scanner(System.in);
//        int days = sc.nextInt();
//        switch (days){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thrusday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid days");
//        }

    }
}
