package PracticeFile.Student_Management_System;

public class Student {
    private int rollno;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;


//    Constructor
    public Student(int rollno, String name, int mark1, int mark2, int mark3) {
        this.rollno = rollno;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

//    Get methods
    public int getRollno() {
        return rollno;
    }
    public String getName() {
        return name;
    }
    public int getMark1() {
        return mark1;
    }
    public int getMark2() {
        return mark2;
    }
    public int getMark3() {
        return mark3;
    }

//    Setter methods
    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

//    Calculate Total
    public int CalculateTotal(){
        return mark1 + mark2 + mark3;
    }

//    calculate Precentage
// Calculate Percentage
public double CalculatePrecentage() {
    double percentage = CalculateTotal() / 3.0;
    return Math.round(percentage * 100.0) / 100.0;
}


//    calculate grade
    public char CalculateGrade(){

        double precentage = CalculatePrecentage();

        if(precentage >= 90){
            return 'A';
        }
        else if(precentage >= 75){
            return 'B';
        }
        else if(precentage >= 60){
            return 'C';
        }
        else if (precentage >= 40){
            return 'D';
        }
        else{
            return 'F';
        }
    }

//    Display student information
    public void display(){
        System.out.println("----------------------------");
        System.out.println("Roll No    : " + rollno);
        System.out.println("Name       : " + name);
        System.out.println("Marks 1    : " + mark1);
        System.out.println("Marks 2    : " + mark2);
        System.out.println("Marks 3    : " + mark3);
        System.out.println("Total      : " + CalculateTotal());
        System.out.println("Percentage :  " + CalculatePrecentage() + "%");
        System.out.println("Grade      : " + CalculateGrade());
        System.out.println("----------------------------");
    }

}
