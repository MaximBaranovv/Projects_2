package com.project.rd.autotasks.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int password = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input == password) {
            System.out.println("Hello, Agent");
        }
        else System.out.println("Access denied");

    }
}
