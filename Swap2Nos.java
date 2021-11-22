package org.example;

import java.util.Scanner;

public class Swap2Nos {
        public static void main(String[] args) {
            int a, b,temp;
            System.out.println("Enter a +ve Number for a: ");
            Scanner sc1 = new Scanner(System.in);
            a = sc1.nextInt();
            System.out.println("Enter a +ve Number for b: ");
            Scanner sc2 = new Scanner(System.in);
            b = sc2.nextInt();
            System.out.println("Numbers before Swapping: " + "a=" + a + " &" + " b=" + b);
            temp=a;
            a=b;
            b=temp;
            System.out.println("Numbers before Swapping: " + "a=" + a + " &" + " b=" + b);
            }
    }

