package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));

    }

    public static boolean[] getSumCheckArray(int[] array){
        boolean []res = new boolean[array.length];
        int sum = array[0];
        for(int i = 2; i < array.length; i ++ ){
            if(array[i] == (array[i-2] + array[i-1])){
                res[i] = true;
            }


        }
        return res;

     //throw new UnsupportedOperationException();
    }
}



    int[] newmass = new int[5];
        /*for (int i = 0; i<1; i++){
            if (array[i]== array[0]){
                if(array[i]> array[i+1]){
                    newmass[i] = array[i];
                }
            }
        }

         */
        if (array[0] > array[1]) {
                newmass[0] = array[0];
                }

                for (int i = 1; i < array.length - 1; i++) {
        if (array[i] > array[i - 1]) {
        if (array[i] == array[array.length - 1]) {

        }
        else if(array[i] > array[i + 1]) {
        newmass[i] = array[i];
        }

        }


        //for (int i = array.length)

        //put your code here

        return newmass;
        // throw new UnsupportedOperationException();
        }










        for (int i = 1; i < array.length - 1; i++) {
        if (array[i] > array[i - 1]) {
        if (array[i] == array[array.length - 1]) {

        } else if (array[i] > array[i + 1]) {
        array[i] = 0;
        }

        }

        }










        for (int i = 1; i < newArray.length; i++) {
        if (newArray[i] == newArray[newArray.length - 1]) {
        if (newArray[i]> newArray[i-1]){
        System.out.println(i);
        newArray[i] =0;
        }
        }