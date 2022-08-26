package com.company;

public class Main {

    public static void main(String[] args) {
        // HW 1
        boolean weekday = false;
        boolean vacation = false;

        if (!weekday || vacation)
            System.out.println ("James sleeps late.");
        else
            System.out.println ("James does not sleep late.");


        // HW 2
        boolean shining = true;
        int time = 12;

        if (shining && (10 <= time && time <= 16))
            System.out.println ("Please use sunscreen.");


        // HW 3
        int a = 22, b = 2;
        boolean same_last_digit;

        if (a % 10 == b % 10)
            same_last_digit = true;
        else
            same_last_digit = false;

        System.out.println (same_last_digit);


        // HW 4
        int smallest_int = 1;
        boolean found = false;

        while (!found) {
            if (smallest_int % 387 == 0 && smallest_int % 6381 == 0)
                found = true;
            else
                smallest_int++;
        }
        System.out.println (smallest_int);
    }
}
