package Basics_of_java;

public class pyramid_Hollow_pattern {
    public static void main(String[] args) {
        int n =5;
        for(int row =1; row<=n; row++){
            // for each row -> vaiable col
            //  part 1
            for(int col=1; col<=(n-row); col++){
                System.out.print("  ");
            }
            // part 2
            if(row == 1 || row==n){
                for(int col=1; col<=(2*row -1); col++){
                    System.out.print("* ");
                }

            }
            else{
                // middle rows
                // 1*
                System.out.print("* ");
                // 2r-3
                for(int col=1; col<=(2*row-3); col++){
                    System.out.print("  ");
                }
                // 1*
                System.out.print("* ");


            }
            System.out.println();
        }

    }
}
