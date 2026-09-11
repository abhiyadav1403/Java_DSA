package Basics_of_java;

public class Pattern {
    public static void main(String[] args) {
//        int n = 5;
////        for each row -> n columns
//        for(int row = 1; row<=n; row++){
//            for(int col=1; col<=n; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for(int i =1; i<=3; i++){
//            for(int j =1; j<=5; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i =1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        int n =5;
//        for(int row =1; row <= 5; row++){
////            for each row -> space, stars
//
////            spaces
//            for(int col =1; col <= n-row; col++){
//                System.out.print(" ");
//            }
////            stars
//
//            for(int col =1 ; col <=n; col++){
//                System.out.print("* ");
//            }
////            move to next row
//
//            System.out.println();
//        }


//        Inverted star problem

//        int n = 5;
//        for(int row =1; row <=n; row++){
//            for(int col=1; col <= n-row+1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Piramid pattern
//        int n =5;
//        for(int row=1; row<=n; row++){
////            for each row -> variable columns
//
////            spaces
//            for(int col=1; col<=n-row; col++){
//                System.out.print(" ");
//            }
////            stars
//
//            for(int col=1; col<= 2*row -1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Inverted Piramid Problem
//        int n =4;
//        for(int row = 1; row <=n; row++){
//               for(int col =1; col <= row-1; col++){
//                    System.out.print(" ");
//            }
//            for(int col= 1; col <= 2*n-2*row +1; col++ ){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n = 4;
//        for(int row =1; row <= n; row++){
//            for(int col=1 ; col <= 6; col++){
//                if(row ==1 || row == n){
//                    System.out.print("* ");
//                }
//                else{
//                    if(col == 1 || col == 6){
//                        System.out.print("* ");
//                    }
//
//                    else{
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//        int m = 4;
//
//        for (int row = 1; row <= m; row++) {
//            for (int col = 1; col <= 6; col++) {
//                if (row == 1 || row == n || col == 1 || col == 6) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  "); // Two spaces
//                }
//            }
//            System.out.println();
//        }

//      hollo right  Triangele

//        int n = 10;
//        for(int row = 1; row<=n; row++){
////            for each row-> variable colums
//            if(row ==1 || row ==2 || row ==n){
//                for(int col=1; col<=row; col++){
//                    System.out.print("* ");
//                }
//            }
//            else{
////                middel rows
//
//                System.out.print("* ");
//
////                (row-2) spaces
//                for(int col=1; col<=(row-2); col++){
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//
//            }
////            move to next row
//            System.out.println();
//        }

//        hollow solid pyramid

//
//        int n =4;
//        for(int row =1; row<=n; row++){
//            for(int col =1; col<=n-row; col++){
//                System.out.print("  ");
//            }
////            part 2
//            if(row ==1){
//                for(int col=1; col<= 2*row -1; col++){
//                    System.out.print("* ");
//                }
//
//            }
//            else{
////                middle rows
////                1*
//                System.out.print("* ");
////                2r-3 spaces
//                for(int col=1; col<=2*row-3; col++){
//                    System.out.print("  ");
//                }
////                1*
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }
//
////        part 2
//        for(int row=1; row<=(n-1); row++){
////            for each row -> variable col
//
////            part1
//            for(int col=1; col<=row; col++){
//                System.out.print("  ");
//            }
////            part 2
//            if(row ==(n-1)){
//                System.out.print("* ");
//            }
//            else{
////                remaining rows
////                1*
//                System.out.print("* ");
//
////                (2(n-r)-3) spaces
//                for(int col=1; col<=(2*(n-row)-3); col++) {
//                    System.out.print("  ");
//                }
////                1*
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//

////Print the this question
//*             *
//* *         * *
//* * *     * * *
//* * * * * * * *
//* * * * * * * *
//* * *     * * *
//* *         * *
//*             *

//        int n =4;
//        for(int row=1; row<=n; row++){
////            part 1
//
//            for(int col =1; col<=row; col++){
//                System.out.print("* ");
//            }
////            part 2
//            for(int col=1; col<=2*(n-row); col++){
//                System.out.print("  ");
//            }
////            part 3
//            for(int col=1; col<=row; col++){
//                System.out.print("* ");
//            }
//
//
//            System.out.println( );
//        }
////
//        for(int row=1; row<=n; row++){
////         part 4
//
//            for(int col=1; col<=n-row+1; col++){
//                System.out.print("* ");
//            }
////            part 5
//            for(int col=1; col<=2*(row-1); col++){
//                System.out.print("  ");
//            }
////            part 6
//            for(int col=1; col<=n-row+1; col++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

//print the number in triangele
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//
//        int m=5;
//        for(int row= 1; row <=m; row++){
//            for(int col=1; col <= row; col++){
//                System.out.print(col + " " );
//            }
//            System.out.println();
//        }

//        Print the number in Triangel
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15


//        int n =5 ;
//        int count =1;
//        for(int row =1; row<=n; row++){
//            for(int col =1; col<=row; col++){
//                System.out.print(count +" ");
//                count++;
//            }
//            System.out.println();
//        }


//        print the
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E

//        int n =5;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=row ; col++){
//                int a = col;
//                int b= ('A' -1);
//                int ans = a+b;
//                char finalAns = (char)ans;
//                System.out.print(finalAns + " ");
//            }
//            System.out.println();
//        }



//Print this question
//        E
////        E D
////        E D C
////        E D C B
////        E D C B A


//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            for(int col=1; col<=row; col++){
//                int a =n-col;
//                int b = 'A';
//                int ans = a+b;
//                char finalAns = (char)ans;
//                System.out.print(finalAns +" ");
//
//            }
//            System.out.println();
//        }

// Print the this question
//      1
//    1 2 1
//  1 2 3 2 1
//1 2 3 4 3 2 1

//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//
//            // Part 1 : Spaces
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//
//            // Part 2 : Increasing numbers
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col + " ");
//            }
//
//            // Part 3 : Decreasing numbers
//            int decRowValue = row - 1;
//            for (int col = 1; col <= row - 1; col++) {
//                System.out.print(decRowValue + " ");
//                decRowValue--;
//            }
//
//            System.out.println();
//        }

//Print this questions
//          1
//        2 2 2
//        3 3 3 3 3
//        4 4 4 4 4 4 4



//        int n =4;
//        for(int row =1; row<=n; row++){
//            for(int col =1; col <= n-row; col++){
//                System.out.print("  ");
//            }
//            for(int col =1; col<= 2*row-1; col++){
//                System.out.print(row + " ");
//            }
//            System.out.println();
//        }

//Print this questions
//          A
//        A B A
//      A B C B A
//    A B C D C B A



//        int n =4;
//        for(int row =1; row <= n; row++){
////            part 1
//            for(int col =1; col<= n-row; col++){
//                System.out.print("  ");
//            }
////            part 2
//            for(int col =1; col<=row; col++){
//                int a = col;
//                int b = 'A'-1;
//                int ans = a+b;
//                char finalAns = (char)ans;
//                System.out.print(finalAns + " ");
//            }
////            Part 3
//            char toPrint = (char)(row+ 'A' -2);
//            for(int col =1; col<= row-1; col++){
//                System.out.print(toPrint + " ");
//                toPrint--;
//            }
//            System.out.println();
//
//        }





    }
}
