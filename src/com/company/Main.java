package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        task1();task2();task3();
    }

    public static void task1() {
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        ;
        System.out.println();
        int y = 10;
        for (y = 10; y != 0; y--) {
            System.out.print(" " + y);
        }
    }


    public static void task2() {
        System.out.println();
        int firstFriday = 5;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Подготовьте отчёт, сегодня пятница " + currentFriday);
        }
    }


    public static void task3() {
        int currentYear = 2022;
        int oldYear = currentYear - 200;
        int newYear = currentYear + 100;

        for (int year = oldYear; year <= newYear; year++){
            if (year % 79 == 0){
                System.out.println(year);
            }
        }
    }
}



