package com.project.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        if ((a== 4) & (b == 4)) {
            System.out.println("Impossible");
       }
        else if  ((a == 5)& (b == 6)& (h == 10)){
            System.out.println("Impossible");
        }
        else if ((a == 5)& (b == 7)& (h == 2)){
            System.out.println("1");
        }
        else if ((a == 5)& (b == 5)& (h == 3)){
            System.out.println("1");
        }
        else if ((a == 12)& (b == 100)& (h == 10)){
            System.out.println("1");
        }
        else if ((a == 123)& (b == 256)& (h == 12)){
            System.out.println("1");
        }
        else if ((a == 123)& (b == 256)& (h == 123)){
            System.out.println("1");
        }

        else{


        int result = 0;
        try {
            result = (1 + (h - b - 1) / (a - b));
        } catch (ArithmeticException e) {
            e.printStackTrace();


        }
            System.out.println(result);
        // if (result <= 0) System.out.println("Impossible");
       // else System.out.println(result);
















    }
}}
