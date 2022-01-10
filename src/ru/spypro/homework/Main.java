package ru.spypro.homework;

public class Main {
    public static void main(String[] args) {
        //exerciseOne();
        //exerciseTwo();
        exerciseThree();
    }


    public static void exerciseOne() {
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i++);
        }
        System.out.println();
        for (int a = 10; a >= 1; ) {
            System.out.print(" " + a--);
        }

    }

    public static void exerciseTwo() {
        int firstFriday = 5;
        int countOfDayInMonth = 31;
        for (; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void exerciseThree() {
        int year = 2010;
        int yearBefore = year - 200;
        int yearAfter = year + 100;
        if (year > yearBefore)
            for (; (year >= yearBefore) && (year <= yearAfter); year = year + 79) {
                System.out.println(year);
            }

    }



}


