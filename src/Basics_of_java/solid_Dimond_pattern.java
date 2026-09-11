package Basics_of_java;

public class solid_Dimond_pattern {
    public static void main(String[] args) {
        int n =5;
        for(int row=1; row<=n; row++){
//            for each row -> variable columns

//            spaces
            for(int col=1; col<=n-row; col++){
                System.out.print(" ");
            }
//            stars

            for(int col=1; col<= 2*row -1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row =1; row<=n; row++){

            if(row == 1) {
                continue;
            }
            for(int col=1; col<=row -1; col++){
                System.out.print("  ");
            }

            for(int col=1; col<=2*n-2*row+1; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
