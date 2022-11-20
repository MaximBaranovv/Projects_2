package com.project.rd.autotasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{-18, 1, 3, 6, 7};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {
       /* int[] mass = Arrays.copyOf(array, array.length);
        int id = 0;

        if (mass[0] <= mass[1]) {
            id++;
        }

        for (int i = 1; i < mass.length - 1; i++) {
            if (mass[i] > mass[i - 1] && mass[i] > mass[i + 1]) {
                continue;
            }
            mass[id++] = mass[i];

        }

        if (mass[array.length - 1] <= mass[mass.length - 2]) {
            mass[id++] = mass[mass.length - 1];
        }

        */System.out.println(Arrays.toString(array));

        int k = 1; //на сколько сдвинем влево
        for (int i = 0; i < k; i++) {
            int tmp = array[0];
            for (int j = 0; j < array.length - 1; j++)
                array[j] = array[j+1];
            array[array.length - 1] = tmp;
        }
        int[] array2 = new int[]{-18, 1, 3, 6, 7};
        int t = 1;
        for(int i = 0; i <k; i++){
            int temp2 =array2[array2.length - 1];
            for (int j = 1; j < array2.length-1; j++)
                array2[j] = array2[j+1];
            array2[0] = temp2;
            array[array.length - 1] = array[i-1];
        }
        System.out.println(array2);








        return (array);
    }
}
