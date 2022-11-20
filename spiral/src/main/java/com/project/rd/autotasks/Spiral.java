package com.project.rd.autotasks;

import java.util.Arrays;
import java.util.Scanner;

class Spiral {
    static int col;
    static int row;
    static int[][] trans_arr = new int[col][row];

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        col = m;
        int n = sc.nextInt();
        row = n;

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[][] trans_arr = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans_arr[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(trans_arr[i][j] + " ");

            }
            System.out.println();
        }


    }


    static int[][] spiral(int rows, int columns) {

return null;
        }


}
