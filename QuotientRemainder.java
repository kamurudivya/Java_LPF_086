package org.example;

import java.util.Scanner;

public class QuotientRemainder {
        public static void main(String[] args) {
            int a,b;
            float c,d;
            System.out.println("Enter a +ve Number for a: ");
            Scanner sc1 = new Scanner(System.in);
            a = sc1.nextInt();
            System.out.println("Enter a +ve Number for b: ");
            Scanner sc2 = new Scanner(System.in);
            b = sc2.nextInt();
            c = a/b;
            d = a%b;
            System.out.println("Quotient of given numbers: " + " a & b = " + c);
            System.out.println("Remainder of given numbers: " + " a & b = " + d);

    }



}
