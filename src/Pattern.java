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

        int n = 4;
        for(int row =1; row <=n; row++){
            for(int col=1 ; col <= 6; col++){
                if(row ==1 || row==n){
                    System.out.print("* ");
                }
                else{
                    if(col == 1){
                        System.out.print("* ");
                    }
                    else if(col == 6){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }


    }
}
