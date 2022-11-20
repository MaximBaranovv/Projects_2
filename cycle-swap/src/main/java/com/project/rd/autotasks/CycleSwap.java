package com.project.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    public static void main(String[] args) {
        int []array = new int[]{1,2,3,4,5,6};
        cycleSwap(array);
    }
    static void cycleSwap(int[] array) {
        if (array.length>0) {
            int temp = array[array.length - 1];

            for (int i = array.length - 2; i >= 0; i--) {
                array[i + 1] = array[i];
            }
            array[0] = temp;
            System.out.println(Arrays.toString(array));
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length>0) {
            for (int j = 0; j < shift; j++) {
                int temp = array[array.length - 1];
                for (int i = array.length - 2; i >= 0; i--) {
                    array[i + 1] = array[i];
                }
                array[0] = temp;
            }
        }
    }
}
