package com.epam.rd.autotasks.max;

import java.util.Arrays;

public class MaxMethod {


    public static void main(String[] args) {
        int []mass = new int[]{ -2, 0, 10, 5};
        int result = MaxMethod.max(mass);
        System.out.println(result == 10);
    }
    public static int max(int[] values) {
       //int []arrayyy = Arrays.copyOf(values,5);
        int i =values[0];
        for (int elem:values) {
            if(i < elem)
                i = elem;

        }
        return i;


        //throw new UnsupportedOperationException();



    }



    }









        /*int []mass = new int[]{1,2,4,5,6,2,4,9};
        int i = 0;
        for (int elem:mass) {
            if(i < elem)
                i = elem;
        }
        System.out.println(i);

         */


