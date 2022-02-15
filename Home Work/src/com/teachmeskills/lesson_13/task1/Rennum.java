package com.teachmeskills.lesson_13.task1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Rennum {

    public static void main(String[] args) {

        Date date = new Date();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date:");
        String s = sc.nextLine();

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of the week: " + dayOfWeek);

    }
}