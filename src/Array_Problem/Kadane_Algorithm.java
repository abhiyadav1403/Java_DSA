package Array_Problem;

public class Kadane_Algorithm {

//  Maximum Subarray
//    Q1. Give an Integer array, nums, find the subarray with the largest sum, and return its sum.

    public int maxSubArray(int[] arr){
        int sum =0;
        int max= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){

//            step1
            sum= sum +arr[i];
//            step2
            max= Math.max(max,sum);
//            step3
            if(sum<0){
                sum=0;
            }

        }
        return max;
    }
}
