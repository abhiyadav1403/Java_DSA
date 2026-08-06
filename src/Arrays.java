import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {


//        int arr[] = new int[5];
//        Scanner src = new Scanner(System.in);
//        int n = arr.length;
////        input
//        for(int i=0; i<=n-1; i++){
//            System.out.println("Provide input for index :" +i);
//            arr[i]= src.nextInt();
//        }
//        System.out.println("Your array contains:");
//        for(int val: arr){
//            System.out.println(val);
//        }



//        decalarion
//        int arr[];
////        allocation
//        arr = new int[5];
////        init
//        int brr[] = {10,20,30};

//        foreach loop
//        for(int val:brr){
//            System.out.println(val);
//        }

//        classical for loop
//        int n= brr.length;
//        for(int i=0; i<=n-1; i++){
//            System.out.println(brr[i]);
//        }



//        System.out.println("value at 0 index "+ brr[0]);
//        System.out.println("Value at 1 index "+ brr[1]);
//        System.out.println("Value at 2 index " + brr[2]);

//        Array of the sum
//        int arr[] = {10,20,30,40,50};
//        int n= arr.length;
//        int sum = 0;
//        for(int i=0; i<=n-1; i++){
//            int value = arr[i];
//             sum = sum + arr[i];
////            System.out.println(sum);
//
//        }
//        System.out.println(sum);

//        Multiplication of the number
//        int arr[] = {10,20,3};
//        int mult =1;
//        int n = arr.length;
//        for(int i=0; i<=n-1; i++){
//            int value = arr[i];
//            mult = mult*arr[i];
//
//        }
//        System.out.println(mult);

//        Maximum of the array
//        int arr[] = {3,2,-5,21,10};
//        int n = arr.length;
//        int maxValue = arr[0];
////        compare maxvalue ko array k har element k sath
//        for(int i =0; i<=n-1; i++){
//            if(arr[i] > maxValue){
////                update maxValue
//                maxValue = arr[i];
//            }
//        }
//        System.out.println(maxValue);
// Minimum value of the array
        int arr[] = {3,2,-5,21,10};
        int n = arr.length;
        int minValue = arr[0];
        for(int i =0; i<=n-1; i++){
            if(arr[i] <minValue){
//                minvalue update
                minValue = arr[i];
            }
        }
        System.out.println(minValue);


    }
}
