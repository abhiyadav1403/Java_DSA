package Array_Problem;

import java.util.ArrayList;
import java.util.List;

public class Wave_print_matrix {

    public List<Integer> wavePrintMatrix(int[][] matrix, int m , int n){

        List<Integer> result = new ArrayList<>();

//        lets move column wise
        for(int col =0; col<n; col++){
//            hr ek column index ko check kro for even/odd
            if((col & 1)==1){
//                odd
//                bottom to top
                for(int row=m-1; row>=0; row--){
                    result.add(matrix[row][col]);
                }
            }
            else{
//                even
//                top to bottom
                for(int row=0; row<m; row++){
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Wave_print_matrix obj = new Wave_print_matrix();
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(obj.wavePrintMatrix(matrix, 3, 3));

    }
}
