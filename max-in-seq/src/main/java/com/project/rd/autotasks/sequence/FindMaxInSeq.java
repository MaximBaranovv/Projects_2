package com.project.rd.autotasks.sequence;
import java.util.*;

public class FindMaxInSeq {
    public static Double max() {
        List<Double> doubleList = new ArrayList<>();
        System.out.println("enter a number :");
        Scanner kb = new Scanner(System.in);
        while (kb.hasNext() ) {
            double input = kb.nextDouble();
            if(input == 0){
                break;
            }
            doubleList.add(input);
        }

        Arrays.stream(doubleList).average();
    return  Collections.max(doubleList);


    }

    public static void main(String[] args) {



        // Get a result of your code

        System.out.println(max());
    }
}
