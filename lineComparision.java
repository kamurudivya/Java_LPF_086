package com.bridgelabz.linecomparision;

import java.lang.Math;  // Importing math Package to calculate power & square root of a number
import java.util.Objects;
import java.util.Scanner;   //Importing Scanner package to get input from user

import static java.lang.Float.compare;

public class lineComparision {
    static float[] x = new float[8];
    static float[] y = new float[8];
    static float a,b;
    public static void main(String[] args) {
        userInput();
        distance();
        comparision();
    }


    // Processing User input for calculating Lenghth of a line
    public static void userInput() {
        for (int i = 0; i < 4; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the coordinates for x : ");
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the coordinates for y : ");
            y[i] = sc.nextInt();
        }
    }

            // Calculating Length of 2 lines
        public static void distance() {
            a = (float) Math.sqrt(Math.pow(x[2] - x[1], 2) + Math.pow(y[2] - y[1], 2));
            b = (float) Math.sqrt(Math.pow(x[4] - x[3], 2) + Math.pow(y[4] - y[3], 2));
        }

            // Comparison of Lenghth of 2 lines
        public static void comparision(){
            if (Objects.equals(a,b)){
                System.out.println("Both lines are equal");
            }
            else if (compare(a,b) < 0){
                System.out.println("Line 1 is less than Line 2");
            }
            else if (compare(a,b) > 0){
                System.out.println("Line 1 is greater than Line 2");
            }
        }


    }