package Array_Problem;

import java.util.Arrays;

public class Array_Problem {

// Q1.->   Sort an Array of 0s and 1s .
    public static int[] sortArray(int[] arr){
        int n = arr.length;
        int i =0;
        int j= n-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
//                swape
//               arr[i]=0;
//               arr[j]=1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[i]==0){
//                i ko age lejao
                i++;
            }
            if(arr[j]==1){
//                j ko decrement kardo
                j--;
            }
        }
        return arr;
    }

//    Missing Number

    public int missingNumber(int[] nums){
        int xorSum = 0;
//        xor with all the array elements
//        int[] arrs = new int[0];
        for(int n: nums){
            xorSum= xorSum^n;
        }

//        xor with all the element in the range
        int n = nums.length;
        for(int i=0; i<=n; i++){
            xorSum= xorSum^i;
        }
//        ans a jaega
        return xorSum;
    }

//    Find the unique element in an array
    public int findUniqueElement(int[] arr){
        int xorSum = 0;
        for(int n: arr){
            xorSum= xorSum^n;
        }
        return xorSum;
    }

    public static void main(String[] args) {
//        int arr[] ={1,0,0,1,1,0,0,1};
//        System.out.println(Arrays.toString(sortArray(arr)));

        int arr[] = {1,2,3,4,5};
        System.out.println(arr.length);

    }
}
