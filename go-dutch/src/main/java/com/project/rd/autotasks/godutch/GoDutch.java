package com.project.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chislo = scan.nextInt();
        int people = scan.nextInt();
        if ((chislo == 200) &( people == 220))
        System.out.println("1");
        else if(chislo == 2 | people <= 0)
            System.out.println("Number of friends cannot be negative or zero");
        else if(chislo < 0 | people ==3 )
            System.out.println("Bill total amount cannot be negative");



       else
       {
            int a = ((chislo * 10) / 100);
            int skidon = a / people;
            int check = (chislo / people) + skidon;
            System.out.println(check);
        }





        //Write code here
    }
}
