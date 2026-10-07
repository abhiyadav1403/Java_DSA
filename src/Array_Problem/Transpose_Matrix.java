package Array_Problem;

import java.util.Arrays;

public class Transpose_Matrix {

    public int[][] transpose(int[][] matrix) {

        if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0){
            return new int[0][0];
        }

//        for original array
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

//        for new array
        int newTotalRows = totalCols;
        int newTotalCols = totalRows;
        int ans[][] = new int[newTotalRows][newTotalCols];

//        actual logic
        for(int i=0; i<totalRows; i++){
            for(int j=0; j<totalCols; j++){
                ans[j][i]=matrix[i][j];
            }
        }
    return ans;
    }

    public static void main(String[] args) {
        Transpose_Matrix obj = new Transpose_Matrix();
        int [][] ans = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(obj.transpose(ans)));
    }
}
