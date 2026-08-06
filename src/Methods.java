public class Methods {

    static void add(int x, int y){
        int sum = x + y;
        return;
//        System.out.println(x + y);
    }

    static void subtracte(int a, int b){
        int sub = a-b;
        System.out.println(sub);
    }
    static void multiplication(int x, int y){
        int multi = x * y;
        System.out.println(multi);
    }
    static void divide(int x, int y){
        int div =  x/y;
        System.out.println(div);
    }

     public static void main(String[] args) {

        add(5,6);
        subtracte(20,5);
        multiplication(15,8);
        divide(100,5);
         System.out.println("hello");

    }
}
