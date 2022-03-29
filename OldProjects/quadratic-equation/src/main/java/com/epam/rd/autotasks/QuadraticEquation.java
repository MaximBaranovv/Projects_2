package com.epam.rd.autotasks;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double D = (b*b) - (4*a*c);
        double x1 = (-b - Math.sqrt(D)) / (2 * a);
        double x2 = ((-b + Math.sqrt(D)) / (2 * a));
         if (D > 0) {
            System.out.print(x1 +" ");
            System.out.print(x2);
        }
        else if (D==0 )
        System.out.println(x1);

        else if (D < 0){
            System.out.println("no roots");
        }

         */
      /*  int[] array;
        int[] arrayInt = new int[100];
        int[] amountDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        System.out.println("Апрель содержит " + amountDays[3] + " дней");
        for (int i = 0; i < amountDays.length; i++) {
            if (amountDays[i] < 31) {
                amountDays[i] = 0;
            }
            arrayInt[i] = amountDays[i];
        }*/
        int[]  arrayInt2 = { 1, 2, 3, 4, 5, 6 };
        for (int element :  arrayInt2) {
            element *=  element;
           //  System.out.println(element);
        }
        for (int i = 0; i < arrayInt2.length; i++) {
            arrayInt2[i] +=2;
            System.out.println(arrayInt2[i]);
        }
        System.out.println(Arrays.toString(arrayInt2));



    }

}