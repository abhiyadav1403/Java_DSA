package Array_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Array_Question {

//    Q1. -> Two Sum

    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        for(int i =0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    int ans []= {i,j};
                    return ans;
                }
            }

        }
        int ans[]= {};
        return ans;
    }

//  Q2. ->   Three Sum

    public List<List<Integer>> threeSum(int[] nums, int target) {

        List<List<Integer>> output = new ArrayList<>();

        int n = nums.length;
        for(int i =0; i<n-2; i++){
            for(int j= i+1; j<n-1; j++){
                for(int k= j+1; k<n; k++){
                    if(nums[i] + nums[j] + nums[k] == target){
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        output.add(ans);
                    }
                }
            }
        }

        return output;
    }


//    Q3. Remove duplicate from sorted array

    public int removeDuplicates(int[] nums) {
        int i =0;
        int j=0;
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        while(i<n){

            if(nums[i] == nums[j]){
                 j++;
            }
            else{
//                no match
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }

//    Q4. -> Find First Repeating Element

    public int findFirstRepeatElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
//        freq store
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);

        }

        for(int i: arr){
            if(map.get(i) > 1){
                return i;
            }
        }
//        agar koi bhi freq >1 nahi h
        return -1;
    }

//    Q5.-> Find the Pivot Index

    public  int pivotIndex(int[] nums){

        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

//      fill left sum vala array
        leftSum[0]= nums[0];
        for(int i =1; i< n; i++){
            leftSum[i]= leftSum[i-1]+nums[i];
        }

//        fill right sun vala array
        rightSum[n-1]= nums[n-1];
        for(int i =n-2; i>=0; i--){
            rightSum[i]= rightSum[i+1]+nums[i];

        }

//        check for equality
        for(int i=0; i<n; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

//        int[] nums = {2,7,11,15};
//        int target = 9;
//        System.out.println(Arrays.toString(nums));
//        Array_Question q = new Array_Question();
//        int[] ans = q.twoSum(nums, target);
//        System.out.println(Arrays.toString(ans));

//        int[] nums = {-1,0,1,2,-1,-4};
//        Array_Question q = new Array_Question();
//        System.out.println(Arrays.toString(new List[]{q.threeSum(nums, 0)}));

//        int[] arr = {1,2,2,2,2,3,3,4};
//        Array_Question q = new Array_Question();
//        System.out.println(q.removeDuplicates(arr));

//        int [] arr = {10,5,3,3,5,6};
//        Array_Question q = new Array_Question();
////        System.out.println(q.removeDuplicates(arr));
//        System.out.println();

        int[] arr = {1,2,3,4,5};
        Array_Question q = new Array_Question();
        System.out.println(q.findFirstRepeatElement(arr));

        int[] arr1 = {1,2,3,4,5};
        Array_Question q1 = new Array_Question();


    }

}
