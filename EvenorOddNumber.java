package org.example;

import java.util.Scanner;

public class EvenorOddNumber {
        public static void main(String[] args) {
            int a;
            System.out.println("Enter a +ve Number: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            if (a%2==0) {
                System.out.println("Given No is an Even Number");
            }
            else {
                System.out.println("Given No is an Odd NUmber");
            }}
        }


