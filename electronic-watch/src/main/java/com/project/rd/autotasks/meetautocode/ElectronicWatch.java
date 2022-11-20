package com.project.rd.autotasks.meetautocode;

import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sec = scan.nextInt();
        if (sec < 0){
            System.out.println("sorry");
        }
        else {
            Date d = new Date(sec * 1000L);
            SimpleDateFormat df = new SimpleDateFormat("H:mm:ss"); // HH for 0-23
            df.setTimeZone(TimeZone.getTimeZone("GMT"));
            String time = df.format(d);
            System.out.println(time);
        }
    }
}
