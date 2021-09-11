package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println(mission1(13, 23));
        plusORminus(5);
        System.out.println(positiveORnegative(-22));
        leapYear(400);
        System.out.println(String.join("", Collections.nCopies(4, "Сложно"+ " ")));

        }

    public static boolean mission1(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20){
            return true;
        }
        else {return false;}
    }

    public static void plusORminus(int x) {
        if (x>=0) {
            System.out.println("positive ");
        } else {
            System.out.println("negative");
        }
    }
    public static boolean positiveORnegative (int y) {
       if (y < 0){
           return false;
        }
       else return true;
    }

    static void leapYear (int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println("год " + year + " не високостный");
        else System.out.println("год " + year + " високосный");
}

       //4. Написать метод, которому в качестве аргументов передается строка и число,
      // метод должен отпечатать в консоль указанную строку, указанное количество раз;
     // Смог сделать только с помощью гугла.
}
