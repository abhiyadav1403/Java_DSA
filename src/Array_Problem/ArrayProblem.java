package Array_Problem;

public class ArrayProblem {

//    find the average of the array
    static double getAverage(int [] arr){
        int sum = 0;
        for(int i: arr){
            sum +=i;
        }
        int size= arr.length;
        double avg= sum/size;
        return avg;
    }


//    Multiply each element of array by 10

    static int[] multiply(int [] arr){
        int size = arr.length;
        int newArray[] = new int[size];

        for(int i =0; i<size; i++){
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
//        return updated array
        return newArray;
    }

//    search for an element in an array {linear search}

    static boolean findTarget(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]== target){
                return true;
            }
        }
//        agar poora array traverl ho chuka hai
//        and ek baar bhi target nahi mila
//        iska mtlb, target is not present in array
//        return false
        return false;
    }

//    find the maximum element of the array

    static int getMax(int [] arr){
        int max= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
//        jab main yaha pohochunga, to poora compare ho chuka hoga
//        and max k ander sabse badi value hogi
        return max;
    }
//howework -> Math.max() ka use kar ke findout karna hai

//    return sum of positive and negative numbers
     static int[] getPosNegSum(int arr[]){
        int posSum=0;
        int negSum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> 0){
//                num is positive
                posSum = posSum + arr[i];
            }
            else{
//                num is negative
                negSum = negSum + arr[i];
            }
        }
        int ans[] = {posSum,negSum};
        return  ans;
     }

//     count the number of zeros and ones
    static int[] getCount(int[] arr){
        int zeroCount=0;
        int oneCount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zeroCount++;
            }
            else{
                oneCount++;
            }
        }
       int ans[] = {zeroCount, oneCount};
        return ans;
    }

//    find first unsorted element in array

    static int getUnsortedElement(int arr[]){
         for(int i=0; i<arr.length; i++){
             if(arr[i+1]<=arr[i]){
                 return arr[i+1];
             }
         }
//         jis case me main loop se bahar ajaunga
         return -1;
    }

    public static  void main(String [] args){

        int arr[] = {2,3,5,4,9};
        System.out.println(getUnsortedElement(arr));


//        int arr[] = {1,0,1,1,0,1,1,1};
//        int[] ans= getCount(arr);
//        System.out.println("ZeroCount: "+ans[0]);
//        System.out.println("OneCount: "+ ans[1]);


//        int arr[] = {2,-3,-5,6,-7,9};
//        int ans[] = getPosNegSum(arr);
//        System.out.println("Positive sum:" +ans[0]);
//        System.out.println("Negative sum: " + ans[1]);

//        int arr[] = {4,19,8,9 ,10};
//        System.out.println(getMax(arr));


//        int arr[] = {2,3,6,4,7,8};
//        boolean ans = findTarget(arr,8);
//        System.out.println(ans);

//        int arr[] = {2,3,4,5,6};
//        int ans[] = multiply(arr);
//        System.out.println("Printing ans array:");
//        for(int i: ans){
//            System.out.println(i);
//        }

//        int[] arr = {1,2,3,4,5};
//        System.out.println(getAverage(arr));

    }
}
