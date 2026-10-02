package Array_Problem;

import java.util.ArrayList;
import java.util.List;

public class Missing_Values {
    public List<Integer> findDisappeardNumber(int[] nums){
        List<Integer> ans = new ArrayList<>();

//        marking
        int n = nums.length;
        for(int index =0; index<n; index++){
            Math math = null;
            int value = math.abs(nums[index]);
            int position = value -1;

//            mark kardo ye position
            if(nums[position] > 0){
                nums[position] = -nums[position];
            }
        }

//        travel array and whenever you enconuter a positive value , print the number at the same time
         for(int i=0; i<n; i++){
             if(nums[i] > 0){
                 int valueAtThisIndex = i+1;
                 ans.add(valueAtThisIndex);
             }
         }
         return  ans;
    }

    public static void main(String[] args) {

        // Input array
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        // Create object
        Missing_Values obj = new Missing_Values();

        // Call method
        List<Integer> result = obj.findDisappeardNumber(nums);

        // Print result
        System.out.println("Missing numbers: " + result);
    }

    }


