package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int m = matrix1.length;
        int n = matrix2[0].length;
        int o = matrix2.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
       /* int pervXmatr = 0;
        int vtorXmatr = 0;
        int vtorYmatr = 0;
        for (int i = 0; i < matrix1.length; i++) {
            pervXmatr++;
        }

        for (int i = 0; i < matrix2.length; i++) {
            vtorXmatr++;
            for (int j = 0; j < matrix2[i].length; j++) {
                vtorYmatr++;
            }
        }

        int ravn = vtorYmatr/vtorXmatr;
        int [][] mass = new int[pervXmatr][ravn];

        int perem = 0;
        for (int i = 0; i < matrix1.length; i++){

            for (int j = 0; j <matrix1[i].length ; j++) {
                int temp = matrix1[i][j] * matrix2[j][perem];

                System.out.println(temp);
            }
        }

        */






        return res;
    }

    public static void main(String[] args) {

        int[][] a = {
                {1, 2,2},
                {3, 1,1},
        };

        int[][] b = {
                {4, 2},
                {3, 1},
                {1, 5}


        };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
