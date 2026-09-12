package Basics_of_java;

public class BitwiseOperator {
    public static void main(String[] args) {

//        int n =5;
//        int m = 6;
//        System.out.println( n & m);
//        System.out.println(n | m);
//        System.out.println(n ^ m);
//
//        int a =5;
//        System.out.println(~a);
//
//        int b =2;
//        for(int i =1; i<=32; i++){
//            n= n << 1;
//            System.out.println(n);
//        }

//        int n =11;
//        if((n&1) == 0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }

//        int n =16;
//        int count =0;
//        while(n != 0){
//            if((n&1) != 0) {
////                mujhe ek set bit milgyi
//                count++;
//            }
////            right shift to remove this bit
//            n = n >>1;
//        }
//        System.out.println("Set bit Count:" + count);


        int n = 32;
        if ((n & (n-1)) == 0){
            System.out.println("Power of 2 hai");
        }
        else{
            System.out.println("Power of 2 nhi hai");
        }
    }
}
