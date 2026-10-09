package Array_Problem;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Print_Matrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<Integer>();

        int startingRow = 0;
        int startingCol = 0;
        int endingRow = m-1;
        int endingCol = n-1;

        while(startingRow <= endingRow && startingCol <= endingCol){

//            row wise left to right -> startingRow print krni h, from startingCol to endingCol
            for(int col=startingCol; col<=endingCol; col++){
                result.add(matrix[startingRow][col]);
            }
            startingRow++;

//            col wise top to bottom -> endingCol print karna h, from startingRow to endingRow

            for(int row=startingRow; row<=endingRow; row++){
                result.add(matrix[row][endingCol]);
            }
            endingRow--;
//            row wise right to left -> endingRow print krni h, from endingCol to startingCol
//             valid endingRow -> startingRow <= endingRow
            if(startingRow < endingRow) {
                for (int col = endingCol; col >= startingCol; col--) {
                    result.add(matrix[endingRow][col]);
                }
                endingCol--;
            }
//            col wise bottom to top -> startingCol print krna h, from endingRow to startingRow
//             valid startingCol present h ya nhi
            if(startingCol<=endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    result.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Spiral_Print_Matrix obj = new Spiral_Print_Matrix();
        List<Integer> result = obj.spiralOrder(new int[][]{
                {1,2,3},{4,5,6},{7,8,9}
        });
        System.out.println(result);


    }
}
