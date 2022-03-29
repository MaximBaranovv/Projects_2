package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a == 0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        else if (a < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {

            String[] string = new String[a];

            scan.nextLine();

            for (int i = 0; i < string.length; i++) {
                string[i] = scan.nextLine();
            }

            for (String str : string) {
                System.out.println("Hello, "+ str);
            }
        }
    }

    }








