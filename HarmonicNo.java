package org.example;
import java.util.Scanner;

public class HarmonicNo {
    public static void main(String[] args) {
        int N, i;
        float s=0, a;
        System.out.println("Enter a +ve integer to find the harmonic value: ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (i=1;i<=N;i++){
            a = ((float)1)/i;
            s = s + a;
        }
        System.out.println("Harmonic Value at position " + N + " is " + s);
    }
}
