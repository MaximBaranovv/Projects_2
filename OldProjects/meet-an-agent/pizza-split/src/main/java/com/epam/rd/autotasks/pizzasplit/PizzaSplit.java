package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        int kuski = scan.nextInt();
        int ravno;
        int a = 1;

        int onepizza = kuski;

        if (kuski % people !=0){

            for (int n =1 ; kuski % people != 0; n++){
                a++;
                kuski = kuski+ onepizza;

            }
            System.out.println(a);

        }
        else {

            System.out.println(1);

        }
       /* int a = 0;
        int b = 10;
        while (a != b){
            System.out.println("a увеличивается");
            a++;
*/




        // int  number = 12;
      //  if(number%8==0) System.out.println("Число делится на 10");



    }
}
