package com.teachmeskills.lesson_13.task1;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

/**
 * 1. Получить день недели по дате
 */

public class Main {
    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat formatDateNow = new SimpleDateFormat("yyyy.MM.dd ' day ' E");
        System.out.println("Current date: " + formatDateNow.format(date));

//        SimpleDateFormat formatDateNow = new SimpleDateFormat("E yyyy.MM.dd ' time ' hh:mm:ss a zzz");
//        получение дня недели, даты и времени (для себя)
//        System.out.println("Current date:" + formatDateNow.format(date));

//        LocalDate today = LocalDate.now();
//        DayOfWeek dayOfWeek = today.getDayOfWeek();
//        System.out.println(today + " " + dayOfWeek);
    }
}