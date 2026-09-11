package Basics_of_java;

public class BasicMaths {

    static  void printdigit(int num){
//  agr mera num=0 toh mai rukjaunga
//  agr mera num! =0 t0h mai processing karta rahunga
        while (num!=0){
            int digit = num % 10;
            System.out.println(digit);
//            last digit remove
            num = num/10;
        }
    }
    static int countdigit(int num){
        int count = 0;
        while(num!=0){
            int digit = num % 10;
            count++;
            num= num/10;
        }
        return count;
    }

    static int sumdigit(int num){
        int sum =0;
        while(num != 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }
    static int reversedigit(int num){
//
        int reverseNum = 0;
        while (num != 0){
            int digit = num % 10;
            reverseNum = reverseNum* 10 + digit;
//
            num = num/10;
        }
        return reverseNum;
    }

    static boolean palindromeNum(int num){
        int orginalNum = num;
        int reverseNum = reversedigit(num);
        if (orginalNum == reverseNum){
            System.out.println("It is a palidrome ");
            return true;
        }
        else{
            System.out.println("It is not a palidrome");
            return false;
        }

    }
    static boolean isprimeNum(int num){
        for(int i =2; i*i <=num ; i++){
            if(num % i== 0){
                return false;
            }
        }
//        for( int i =2; i<=num-1; i++){

//        }
        return true;
    }

    static int getGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int ans = a;
        return ans;
    }
    static int getLCM(int a, int b){
        int gcd = getGCD(a, b);
        int prod = a * b;
        int lcm = prod / gcd;
        return lcm;
    }

    static boolean isAmstrongeNumber(int num){
        int sum = 0;
        int orginialNumber = num;
        while (num != 0){
            int digit =  num % 10;
            int cubedigit = digit * digit * digit;
            sum  = sum + cubedigit;
            num = num/ 10;

        }
        if(sum == orginialNumber){
            System.out.println("It is a Amstronge number");
            return true;
        }
        else{
            System.out.println("It is not a Amstronge number");
            return false;
        }
    }

    static boolean isPerfectNumber(int num){
        int sum  =1;
        for(int i =2; i*i <= num; i++){
            if (num % i == 0){
//                i ne num ko perfectly divide kar diya
//                ab factor pair kya banega
//                1 factor -> i
//                2nd factor -> num ko divide karne pe banega num/i
                int firstfactor = i;
                int secondfactor = num / i;
                sum = sum  + firstfactor + secondfactor;
            }
        }
        if( sum == num){
            return true;
        }
        else{
            return false;
        }
    }

    static void printAllPrime(int num){
        for(int i =2; i <= num; i++){
            boolean isPrime = isprimeNum(i);
            if (isPrime == true){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        printAllPrime(100);
//        System.out.println(isPerfectNumber(6));
//        System.out.println(isAmstrongeNumber(153));
//        System.out.println(getLCM(18,12));
//        System.out.println(getGCD(12,18));
//        int num = 53;
//        System.out.println(primeNum(num));

//        int num= 121;
//        boolean ans = palindromeNum(121);
//        System.out.println(ans);
//        int multi = reversedigit(num);
//        System.out.println(multi);
//        int ans1 = sumdigit(num);
//        System.out.println(ans1);
//        int ans = countdigit(num);
//        System.out.println(ans);

//        printdigit(num);

    }
}
