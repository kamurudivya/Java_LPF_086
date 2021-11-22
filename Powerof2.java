package org.example;
import java.util.Scanner;

public class Powerof2 {
    public static void main(String[] args) {
        int a, i, N;
        System.out.println("Input a +ve integer less than 31 & greater than 0: ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        if (N>=31){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else {
            for (i=0;i<=N;i++){
                a = (int) Math.pow(2, i);
                System.out.println("2^" + i + " = " + a);
            }
        }
    }

    }
