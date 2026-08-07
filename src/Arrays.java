import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {


////        int arr[] = new int[5];
////        Scanner src = new Scanner(System.in);
////        int n = arr.length;
//////        input
////        for(int i=0; i<=n-1; i++){
////            System.out.println("Provide input for index :" +i);
////            arr[i]= src.nextInt();
////        }
////        System.out.println("Your array contains:");
////        for(int val: arr){
////            System.out.println(val);
////        }
//
//
//
////        decalarion
////        int arr[];
//////        allocation
////        arr = new int[5];
//////        init
////        int brr[] = {10,20,30};
//
////        foreach loop
////        for(int val:brr){
////            System.out.println(val);
////        }
//
////        classical for loop
////        int n= brr.length;
////        for(int i=0; i<=n-1; i++){
////            System.out.println(brr[i]);
////        }
//
//
//
////        System.out.println("value at 0 index "+ brr[0]);
////        System.out.println("Value at 1 index "+ brr[1]);
////        System.out.println("Value at 2 index " + brr[2]);
//
////        Array of the sum
////        int arr[] = {10,20,30,40,50};
////        int n= arr.length;
////        int sum = 0;
////        for(int i=0; i<=n-1; i++){
////            int value = arr[i];
////             sum = sum + arr[i];
//////            System.out.println(sum);
////
////        }
////        System.out.println(sum);
//
////        Multiplication of the number
////        int arr[] = {10,20,3};
////        int mult =1;
////        int n = arr.length;
////        for(int i=0; i<=n-1; i++){
////            int value = arr[i];
////            mult = mult*arr[i];
////
////        }
////        System.out.println(mult);
//
////        Maximum of the array
////        int arr[] = {3,2,-5,21,10};
////        int n = arr.length;
////        int maxValue = arr[0];
//////        compare maxvalue ko array k har element k sath
////        for(int i =0; i<=n-1; i++){
////            if(arr[i] > maxValue){
//////                update maxValue
////                maxValue = arr[i];
////            }
////        }
////        System.out.println(maxValue);
//// Minimum value of the array
////        int arr[] = {3,2,-5,21,10};
////        int n = arr.length;
////        int minValue = arr[0];
////        for(int i =0; i<=n-1; i++){
////            if(arr[i] <minValue){
//////                minvalue update
////                minValue = arr[i];
////            }
////        }
////        System.out.println(minValue);
//
//
////        2D array
//
////        decalartion
//        int [][] arr;
////        allocation
//        arr = new int [3][4];
////        initialization
//        int [][] brr = {
//                {1,2},
//                {3,4,6,7},
//                {2,3,4,5,6,7},
//                {4,5}
//        };
////        System.out.println(brr[2][1]);
//
//        int rowlength = brr.length;
//        int collength = brr[0].length;


//        for(int rowIndex =0; rowIndex<=rowlength-1; rowIndex++){
//
////            jaise hi main kisi new row me avuga
////            same point pr maine us row ka collength findd out krlia
////            current row -> brr[rowIndex]
////            jsme kitne columns -> brr[rowIndex].length
//            int collength = brr[rowIndex].length;
//            for(int colIndex =0; colIndex<=collength-1; colIndex++){
//                System.out.print(brr[rowIndex][colIndex]+ " ");
//            }
//            System.out.println();
//        }

//        traversal 2-D array

//        for(int  rowIndex =0; rowIndex<=brr.length-1; rowIndex++){
//            for(int colIndex =0; colIndex<= brr[rowIndex].length-1; colIndex++){
//                System.out.print(brr[rowIndex][colIndex]+ " ");
//            }
//            System.out.println();
//        }

//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
////  input
//        for(int i =0; i<=arr.length-1; i++){
//            for(int j=0; j<=arr[i].length-1; j++){
//                System.out.println("Provide Value for row=" +i+ " and column=" +j);
//                arr[i][j] = sc.nextInt();
//            }
//        }

//        Print
//        for(int  rowIndex =0; rowIndex<=arr.length-1; rowIndex++){
//            for(int colIndex =0; colIndex<= arr[rowIndex].length-1; colIndex++){
//                System.out.print(arr[rowIndex][colIndex]+ " ");
//            }
//            System.out.println();
//        }

//        int arr[][] = { {1,21,3}, {11,32,13}};
//        int sum = 0;
//        for(int i = 0; i<= arr.length-1; i++){
//            for(int j=0; j<=arr[i].length-1; j++){
////                int val = arr[i][j];
//                sum = sum +arr[i][j];
////                System.out.println(arr[i][j]);
//            }
//        }
//        System.out.println(sum);

//        int mult = 1;
//        for(int i =0; i <=arr.length-1; i++){
//            for(int j=0; j <= arr[i].length-1; j++){
//                mult = mult*arr[i][j];
//            }
//        }
//        System.out.println(mult);
//

//        int arr[][] = { {1,21,3}, {11,32,13}};
//        int maxValue = arr[0][0];
//        for(int i=0; i<=arr.length-1; i++ ){
//            for(int j=0 ;j<= arr[i].length-1; j++){
//                if(arr[i][j]> maxValue){
////                    update max
//                    maxValue= arr[i][j];
//                }
//            }
//        }
//        System.out.println(maxValue);

        int arr[][] = { {100,21,333}, {11,32,13}};
        int minValue = arr[0][0];
        for(int i=0; i<= arr.length-1; i++ ){
            for(int j=0; j<=arr[i].length-1; j++){
                if(arr[i][j]< minValue){
                    minValue= arr[i][j];
                }
            }
        }
        System.out.println(minValue);


    }
}
