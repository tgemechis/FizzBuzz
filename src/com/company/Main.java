package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number ");
        int number = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
        for (int j = 1; j <= number ; j++) {
            if (j % 7 == 0) {
                System.out.println( j + " is multiple of 7");
            } else if (j % 17 == 0) {
                System.out.println( j + " is multiple of 17");
            } else if (j % 27 == 0) {
                System.out.println(j + "is multiple of 27");
            }
        }

    }
}
