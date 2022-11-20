package com.project.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {


        int x  = 0;
        int y = 0;
        for(int i = 0; i < matrix.length; i++){
            x++;
            for (int j = 0; j < matrix[i].length; j++) {
                y++;
            }
        }
        int c = y/x;
        int [][]mass = new int[c][x];
        for (int i = 0; i< matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++ ){
                int temp = matrix[i][j];
                mass[j][i] = temp;
            }

        }




        System.out.println(x);
        System.out.println(y);
        System.out.println(y/x);


        return mass;
}



    public static void main(String[] args) {


        int[][] matrix = {
                {1, 2,3,2,2},
                {1, 2,3,2,2},
                {7, -13,3,2,2},
                {78, 11,3,2,2}};

        int[][] result = transpose(matrix);

        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
