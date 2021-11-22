package org.example;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {

        // INITIALIZATION
        int n, h_cnt = 0, t_cnt = 0;
        double heads, tails;


        // INPUT DATA
        System.out.print("enter no. of times you want to flip the coin: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // COMPUTATION
        for (int j = 0; j < n; j++) {
            double random = Math.random();
            if (random < 0.5)
                t_cnt++;
            else
                h_cnt++;
        }

        heads = h_cnt / (double) n * 100;
        tails = t_cnt / (double) n * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");

    }

}

