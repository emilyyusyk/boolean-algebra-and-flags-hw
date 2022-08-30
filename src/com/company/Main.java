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


        // HW 6
        int p = 23;
        boolean prime = true;

        if (p == 2 || p == 3)
            prime = true;
        else if (p == 1 || p % 2 == 0 || p % 3 == 0)
            prime = false;
        else {
            int c = 5;
            while (prime && c <= Math.sqrt(p)) {
                if (p % c == 0) {
                    prime = false;
                }
                else
                    c = c + 2;
            }
        }
        if (prime)
            System.out.println ("The number is a prime number.");
        else
            System.out.println ("The number is not a prime number.");


        // HW 7
        boolean A = true, B = false, statement;
        if (A == B)
            statement = true;
        else
            statement = false;
        System.out.println (statement);
    }
}
