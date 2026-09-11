package PracticeFile.Inheritance;

class College{
    College(){
        System.out.println("This is college.");
    }
}
class Teacher extends College{
    Teacher(){
        System.out.println("This is teacher in college.");
    }
}
class  Student extends College{
    Student(){
        System.out.println("This is student in college.");
    }
}

public class hierarchical_Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
    }
}
