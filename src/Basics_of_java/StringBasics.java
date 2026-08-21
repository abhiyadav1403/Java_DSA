package Basics_of_java;

public class StringBasics {

    static void printString(String str){
        int n = str.length();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getLengthOfString(String str){
        char[] ch= str.toCharArray();
        int len= ch.length;
        return len;
    }

    static int getVowelscount(String str){
        int count =0;
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch== 'u'){
                count ++;

            }
        }
        return count;
    }

    static String reverseString(String str){
        String reverse = "";
        int n = str.length();
        for(int i = n-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;

        }
        return reverse;
    }

    static boolean isPalindrome(String str){
        String original = str;
        String revese = reverseString(original);
        for(int i =0; i<= original.length()-1; i++){
            char ch1 = original.charAt(i);
            char ch2  = revese.charAt(i);
            if( ch1 != ch2){
                return false;
            }
        }
//        loop ke bahar mai tabhi aunga jab saare character match kare honge
//        iska matlab true hai
        return true;
    }



    public static void main(String[] args) {

        String str = "    Abhi  ";
        String str1= str.trim();
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
//        String str = "Abhishek";
//        String str = "noon";
//        System.out.println(isPalindrome(str));
//        System.out.println(reverseString(str));
//        System.out.println(getVowelscount(str));
//        System.out.println(getLengthOfString(str));
//        printString(str);

//
//        String str = "My name is Abhishek";
//        System.out.println(str.substring(3,7));
//        System.out.println(str.contains("the"));

//        int num = 123;
//        String str = String.valueOf(num);
//        System.out.println(num+1);
//        System.out.println(str+1);

//        String str = "java programming langunge";
//        System.out.println(str.startsWith("java"));
//        System.out.println(str.endsWith("langunge"));


//        String str = "Abhishek";
//        char[] crr = str.toCharArray();
////        print the character arrary
//        for(char ch: crr){
//            System.out.println("value of ch: "+ ch);
//        }

//        split method the split -> String array
//        String name = "My name is abhi";
//        String[] words = name.split(" ");
//        for(String str : words){
//            System.out.println(str);
//        }

////        replace the string another the string
//        String name = "sonu";
//        name = name.replace("s", "m");
//        System.out.println(name);


//        String input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide the String");
//        String str= sc.nextLine();
//        System.out.println("value in nextline:" + str);
//
//        System.out.println("Provide the String");
//        String str1= sc.next();
//        System.out.println("value next:" + str1);

//        Comparsion String
//        Method -> 1
//        String name = "Love";
//        String name1 = "Love";
//        if (name == name1 ){
//            System.out.println("Both are the same string");
//        }
//        else {
//            System.out.println("Both are not the same string");
//        }
//
//
////        Method -> 2
//
//        String str = "Love";
//        String str1 = "LOVe";
//        if (str.equals(str1)){
//            System.out.println("Both are the equal ");
//        }
//        else{
//            System.out.println("Both are not equals");
//        }
//
////        Method -> 3
//        String str2 = "Love";
//        String str3 = "LOVE";
//        if (str2.equalsIgnoreCase(str3)){
//            System.out.println("Both string are equal");
//        }
//        else{
//            System.out.println("Both string are not equal");
//        }

//
//        String firstname = "Abhishek";
//        String lastname = new String("Yadav");
//        System.out.println(firstname + " " + lastname);
//        System.out.println(firstname.length());
//        System.out.println(firstname.charAt(0));
    }
}
