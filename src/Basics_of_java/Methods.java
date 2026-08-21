package Basics_of_java;

public class Methods {

//    static void add(int x, int y){
//        int sum = x + y;
//        return;
////        System.out.println(x + y);
//    }
//
//    static void subtracte(int a, int b){
//        int sub = a-b;
//        System.out.println(sub);
//    }
//    static void multiplication(int x, int y){
//        int multi = x * y;
//        System.out.println(multi);
//    }
//    static void divide(int x, int y){
//        int div =  x/y;
//        System.out.println(div);
//    }

        static void printTable(){
            for(int i=1; i<=10; i++){
                int ans =i*2;
                System.out.println("table ->"+ans);
            }
        }

        static void printsum(int a, int b){
//            x = a +b;
            System.out.println("value of the sum "+ (a + b));
        }

        static void printmulitplication(int x, int y){
            int mult = x*y;
            System.out.println("multiplide value: " +mult);
        }

        static int add(int x, int y){
            int sum = x + y;
            return sum;
        }

        static int add(int x, int y, int z){
            int ans = x + y + z;
//            System.out.println("value :" + ans);
            return ans;
        }
        static float add(int x, float y){
            float val = x + y;
            return val;
        }
        static void solve(int num){
            System.out.println("inside value: " +num);
            num = num*10;
            System.out.println("inside value :" +num);
        }

//   Q.1-> Create the number iseven (int number)  that return true if number  is even

    static boolean isEven(int number){
            return number % 2 == 0;
    }
// Q.2 -> Create the number getmaximum(int a, int b) that return the largest number
    static int getMaximum(int a, int b){
            if(a > b){
                return a;
            }
            else {
                return b;
            }
    }

//    Q.3 -> Create a method to calculate pracentage(int obtain, int total)
            static void calculatePracentage(int obtain, int total){
            float result = ((float)obtain / total) * 100;
                System.out.println("total precentage " +result + "%");

    }




     public static void main(String[] args) {
            calculatePracentage(710,900);
            int ans = getMaximum(10,19);
         System.out.println(ans);
//            int ans = isEven(7);
//         System.out.println(ans);
         System.out.println(isEven(6));
         System.out.println(isEven(9));
//            int num = 5;
//         System.out.println(" inside main :" +num );
//         solve(num);
//         System.out.println("inside main :" + num);
//            float result0 = add(40,6);
//         System.out.println(result0);
//            int result1 = add(5,6);
//            int result2 = add(19,1,5);
//         System.out.println("Result1 :" + result1);
//         System.out.println("Result2 :" + result2);
//            int result = add(10,15);
//         System.out.println("print the non-void value "+ result);
//
//            printmulitplication(10,4);
//            printsum(19,1);
//            printTable();

//        add(5,6);
//        subtracte(20,5);
//        multiplication(15,8);
//        divide(100,5);
//         System.out.println("hello");

    }
}
