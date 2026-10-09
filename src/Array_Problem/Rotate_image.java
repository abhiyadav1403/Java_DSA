package Array_Problem;

public class Rotate_image {

    public void rotatelockwise(int[][] matrix, int N){
//        step1: transpose of a matrix
//        swap matrix[i][j] , matrix[j][i]
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
//                swap matrix[i][j] , matrix[j][i]
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
//        step2: reverse all rows of matrix
//        har row pr jaunga
//        and use reverse kardunga
        for(int row=0; row<N; row++){
//            ab main ek nayi row pr aa chuka hu
//            ab reverse start kardo
            int startCol=0;
            int endCol=N-1;
            while(startCol <= endCol){
//                swap matrix[row][startCol], matrix[row][endCol]
                int temp=matrix[row][startCol];
                matrix[row][startCol]=matrix[row][endCol];
                matrix[row][endCol]=temp;


                startCol++;
                endCol--;

            }
        }
    }

    public static void main(String[] args) {

        Rotate_image obj = new Rotate_image();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        obj.rotatelockwise(matrix, 3);

    }
}
