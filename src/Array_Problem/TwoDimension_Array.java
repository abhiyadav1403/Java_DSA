package Array_Problem;

import java.util.ArrayList;
import java.util.List;

public class TwoDimension_Array {

//    Print the sum of EachRow in a 2D Array
//
//    public List<Integer> rowSums(int[][] arr) {
//
//        List<Integer> result = new ArrayList<>();
//
//        int m = arr.length;
//        int n = arr[0].length;
//
////        traversal
//        for(int row =0; row<n; row++){
////            jaise hi main kisi nayi row me aaunga
////            waise hi main sum=0 kardunga
//            int sum =0;
//            for(int col=0; col<n; col++){
//                int value= arr[row][col];
//                sum=sum+value;
//            }
////            jab main sare column ki values travel and add
////            kr chuka hounga, tab mere pass sum wale variable
////            me entire row ka sum ready hoga
//            result.add(sum);
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        TwoDimension_Array obj = new TwoDimension_Array();
//        int[][] arr = new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.println(obj.rowSums(arr));
//    }


//  Q.2 Print the Each column in a 2D array

     public List<Integer> columnSums(int[][] matrix) {
         List<Integer> result = new ArrayList<>();

         int m = matrix.length;
         int n = matrix[0].length;
         for(int col=0; col<n; col++){
             int sum =0;
             for(int row=0; row<m; row++){
                 int value = matrix[row][col];
                 sum = sum + value;
             }
//             jaise hi main ek column me , entire traversal karke
//             sum nikal chuka hounga , tab main uss sum ko result me sum kar denge
             result.add(sum);
         }
         return result;
     }

    public static void main(String[] args) {
        TwoDimension_Array obj = new TwoDimension_Array();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(obj.columnSums(matrix));
    }




}

