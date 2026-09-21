package Array_Problem;

import java.util.HashMap;

public class Array_Manipulation_Problem {

//    Q1. Reverse an array.
    static void reverseArrary(int[] arr){
        int n = arr.length;
        int i =0;
        int j=n-1;
        while(i<=j){
//            swape
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
//            i ko aage badhao
            i++;
//            j ko piche lao
            j--;
        }
//        now you array has been reversed
//        print
        for(int k: arr){
            System.out.println(k);
        }
    }

//    Q2. Shift array element by 1 Position
static void shift(int[] arr){
//    step1: store last wale ki value
    int n = arr.length;
    int temp= arr[n-1];
//    step2: shift all values of array

    for(int i=arr.length-1; i>0; i--){
        arr[i]=arr[i-1];;
    }
//    step3: temp ki value ko 0 index pr copy

    arr[0]=temp;
}

//Q3. Print Exterme Element in an alternate manner?

    static void printAlternate(int [] arr){
        int n = arr.length;
        int i =0;
        int j= n-1;
        while(i<=j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            else{
//                i<j
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }

//    Q4. find the mode of array?

    static int getMode(int [] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

//        ProcessEnvironment freq;
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

//        for(int i: freq.keySet()){
////            i -> will represent key
//            System.out.println(i + " -> "+ freq.get(i));
//        }

        int maxFreq=-1;
        int maxFreqWaliKey=-1;

        for(int key: freq.keySet()){

            int currentKey=key;
            int currentFreq=freq.get(key);
            if(currentFreq>maxFreq){
//                mujhe naya max mil gaya
                maxFreq=currentFreq;
                maxFreqWaliKey=currentKey;
            }
        }
//        jab loop se bahar aoge toh max freq ali key ready hogi
        return maxFreqWaliKey;
    }


//    Q4. Identify element with highest and lowest frequency?

    static int[] getHighestLowestFreqElement(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();

//        insert data
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
//        hashmap is ready
        int highestFreq= Integer.MIN_VALUE;
        int highesttNum =-1;
        for(int key: freq.keySet()){
            int currentKey=key;
            int currentFreq=freq.get(key);
            if(currentFreq>highestFreq){
//                highest ko update karna chahiye
                highestFreq=currentFreq;
                highesttNum=currentKey;
            }
        }
        int lowestFreq= Integer.MAX_VALUE;
        int lowestNum =-1;
        for(int key: freq.keySet()){
            int currentKey=key;
            int currentFreq=freq.get(key);
            if(currentFreq<lowestFreq){
//                its time to update
                lowestFreq=currentFreq;
                lowestNum=currentKey;
            }
        }
       int ans[]= {highesttNum, lowestNum};
        return ans;
    }

    public static void main(String[] args) {


        int arr[]= {1,2,2,2,3,3,4,4,5,5,5,5,5,5};
        int ans []= getHighestLowestFreqElement(arr);
        System.out.println("highest element is "+ans[0]);
        System.out.println("lowest element is "+ans[1]);


//        int ans =getMode(arr);
//        System.out.println(ans);


//        int arr[] = {1,2,3,4,5};
//        printAlternate(arr);

//        reverseArrary(arr);

//        shift(arr);
//        for(int a: arr){
//            System.out.print(a + " ");
//        }
    }
}
